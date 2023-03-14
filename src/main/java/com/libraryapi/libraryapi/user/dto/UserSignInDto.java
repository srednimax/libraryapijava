package com.libraryapi.libraryapi.user.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserSignInDto {
    private String email;
    private String password;

}
