package com.divyansh.fullstacklabs.springSecurityApplication.dto;

import lombok.Data;

@Data
public class LoginDto {
    private String email;
    private String password;
}
