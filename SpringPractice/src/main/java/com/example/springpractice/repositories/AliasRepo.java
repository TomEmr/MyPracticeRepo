package com.example.springpractice.repositories;

import com.example.springpractice.models.Alias;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AliasRepo extends CrudRepository<Alias, Long> {

    Optional<Alias> findByAlias(String alias);

    @Override
    List<Alias> findAll();

}
