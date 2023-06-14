package com.example.springpractice.services;

import com.example.springpractice.models.Alias;

import java.util.List;

public interface AliasServiceI {
    boolean existByAlias(String alias);

    List<Alias> getAll();

    Alias save(String url, String alias);

}
