package com.libraryapi.libraryapi.user.dto;

import com.libraryapi.libraryapi.user.Gender;
import com.libraryapi.libraryapi.user.Role;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserSignUpDto {
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private LocalDate birth;
    private Gender gender;
    private Role role;
    private double penalty;

}
