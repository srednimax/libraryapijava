package com.libraryapi.libraryapi.user;

import com.libraryapi.libraryapi.user.dto.UserDto;
import com.libraryapi.libraryapi.user.dto.UserSignUpDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/user")
public class UserController {

    private final UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getUsers(){
        return userService.getUsers();
    }
    @PostMapping(path = "SignUp")
    public UserDto signUp(@RequestBody UserSignUpDto userSignUpDto){
        return userService.signUp(userSignUpDto);
    }
}
