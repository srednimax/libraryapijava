package com.libraryapi.libraryapi.user.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserUpdatePasswordDto {
    private Integer id;
    private String oldPassword;
    private String newPassword;
    private String confirmNewPassword;

    public UserUpdatePasswordDto(Integer id, String oldPassword, String newPassword, String confirmNewPassword) {
        this.id = id;
        this.oldPassword = oldPassword;
        this.newPassword = newPassword;
        this.confirmNewPassword = confirmNewPassword;
    }
}
