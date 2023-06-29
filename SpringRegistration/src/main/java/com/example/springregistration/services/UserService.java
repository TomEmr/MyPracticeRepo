package com.example.springregistration.services;

import com.example.springregistration.models.User;
import com.example.springregistration.models.UserDto;

import java.util.List;

public interface UserService {

    void saveUser(UserDto userDto);

    User findByEmail(String email);

    List<UserDto> findAllUsers();
}
