package com.libraryapi.libraryapi.user;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public UserService(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    public List<User> getUsers(){
        return  userRepository.findAll();
    }

    public UserDto signUp(UserSignUpDto userSignUpDto) {
        Optional<User> userByEmail = userRepository
                .findUserByEmail(userSignUpDto.getEmail());

        if(userByEmail.isPresent())
        {
            throw new IllegalStateException("Email exist in database");
        }
        User user = userRepository.save(modelMapper.map(userSignUpDto,User.class));
        return modelMapper.map(user,UserDto.class);
    }
}
