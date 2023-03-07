package com.libraryapi.libraryapi.user;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name="Users")
@Getter
@Setter
@NoArgsConstructor
public class User {
    @Id
    @SequenceGenerator(
            name ="user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
            generator = "user_sequence"
    )
    private Integer id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private LocalDate birth;
    private Gender gender;
    private Role role;
    private double penalty;

    public User(String email, String password, String firstName, String lastName, String phoneNumber, LocalDate birth, Gender gender, Role role, double penalty) {
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
