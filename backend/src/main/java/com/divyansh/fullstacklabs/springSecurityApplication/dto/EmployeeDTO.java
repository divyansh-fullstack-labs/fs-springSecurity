package com.divyansh.fullstacklabs.springSecurityApplication.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EmployeeDTO {

    private Long id;


    private String name;


    private String email;


    private Integer age;


//    @Pattern(regexp = "^(ADMIN|USER)$", message = "Role of Employee can either be USER or ADMIN")

    private String role; //ADMIN, USER


    private Double salary;


    private LocalDate dateOfJoining;

    @JsonProperty("isActive")
    private Boolean isActive;
}
