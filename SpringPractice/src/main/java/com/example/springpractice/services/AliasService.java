package com.example.springpractice.services;

import com.example.springpractice.models.Alias;
import com.example.springpractice.repositories.AliasRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AliasService implements AliasServiceI {

    private final AliasRepo aliasRepo;

    //    explicitně říkám použij tento konstruktor, abys mi tam dosadil tohle repo/závislosti
    @Autowired
    public AliasService(AliasRepo aliasRepo) {
        this.aliasRepo = aliasRepo;
    }

    @Override
    public boolean existByAlias(String alias) {
        return aliasRepo.findByAlias(alias).isPresent();
    }

    @Override
    public List<Alias> getAll() {
        return aliasRepo.findAll();
    }

    @Override
    public Alias save(String url, String alias) {
        return aliasRepo.save(new Alias(alias, url));
    }

}
