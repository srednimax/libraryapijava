package com.libraryapi.libraryapi.user;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public User getUsers(){
        return  new User();
    }
}
