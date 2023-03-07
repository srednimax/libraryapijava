package com.libraryapi.libraryapi.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers(){
        return  userRepository.findAll();
    }

    public User signUp(User newUser) {
        Optional<User> userByEmail = userRepository
                .findUserByEmail(newUser.getEmail());

        if(userByEmail.isPresent())
        {
            throw new IllegalStateException("Email exist in database");
        }
        User addedUser = userRepository.save(newUser);
        return addedUser;
    }
}
