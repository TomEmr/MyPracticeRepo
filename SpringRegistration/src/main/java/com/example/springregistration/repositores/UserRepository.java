package com.example.springregistration.repositores;

import com.example.springregistration.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findByEmail(String email);

    Boolean existsByEmail(String email);

    @Override
    List<User> findAll();

}
