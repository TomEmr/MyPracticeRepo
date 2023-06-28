package com.example.springsecurity.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    private Long id;
    private String firstName;
    private String lastName;
}
