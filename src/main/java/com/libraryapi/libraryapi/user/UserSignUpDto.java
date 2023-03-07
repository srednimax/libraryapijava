package com.libraryapi.libraryapi.user;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
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

    public UserSignUpDto(String email, String password, String firstName, String lastName, String phoneNumber, LocalDate birth, Gender gender, Role role, double penalty) {
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.birth = birth;
        this.gender = gender;
        this.role = role;
        this.penalty = penalty;
    }
}
