package com.example.springregistration.repositores;

import com.example.springregistration.models.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByEmail(String email);

    @Override
    List<User> findAll();

}
