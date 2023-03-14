package com.libraryapi.libraryapi.user.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserUpdatePasswordDto {
    private Integer id;
    private String oldPassword;
    private String newPassword;
    private String confirmNewPassword;

}
