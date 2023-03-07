package com.libraryapi.libraryapi.user.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserSignInDto {
    private String email;
    private String password;

    public UserSignInDto(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
