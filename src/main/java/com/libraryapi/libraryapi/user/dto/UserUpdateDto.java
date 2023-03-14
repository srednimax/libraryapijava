package com.libraryapi.libraryapi.user.dto;

import com.libraryapi.libraryapi.user.Gender;
import com.libraryapi.libraryapi.user.Role;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserUpdateDto {
    private Integer id;
    private String email;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private Gender gender;


}
