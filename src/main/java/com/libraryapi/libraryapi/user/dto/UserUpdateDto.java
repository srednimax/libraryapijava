package com.libraryapi.libraryapi.user.dto;

import com.libraryapi.libraryapi.user.Gender;
import com.libraryapi.libraryapi.user.Role;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class UserUpdateDto {
    private Integer id;
    private String email;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private Gender gender;

    public UserUpdateDto(Integer id, String email, String firstName, String lastName, String phoneNumber, Gender gender) {
        this.id = id;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }
}
