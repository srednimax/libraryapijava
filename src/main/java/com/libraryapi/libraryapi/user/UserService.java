package com.libraryapi.libraryapi.user;

import com.libraryapi.libraryapi.config.JwtService;
import com.libraryapi.libraryapi.user.dto.UserDto;
import com.libraryapi.libraryapi.user.dto.UserSignInDto;
import com.libraryapi.libraryapi.user.dto.UserSignUpDto;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;


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
        userSignUpDto.setPassword(passwordEncoder.encode(userSignUpDto.getPassword()));
        User user = userRepository.save(modelMapper.map(userSignUpDto,User.class));
        return modelMapper.map(user,UserDto.class);
    }

    public UserDto signIn(UserSignInDto userSignInDto) {
        Optional<User> userByEmail = userRepository
                .findUserByEmail(userSignInDto.getEmail());

        if(userByEmail.isEmpty())
        {
            throw new IllegalStateException("Email not found");
        }

        boolean matches = passwordEncoder.matches(userSignInDto.getPassword(),userByEmail.get().getPassword());
        if(!matches){
            throw new IllegalStateException("Wrong email or password");
        }
        var jwtToken = jwtService.generateToken(userByEmail.get());
        var userDto =modelMapper.map(userByEmail.get(),UserDto.class);
        userDto.setJwtToken(jwtToken);
        return userDto;
    }
}
