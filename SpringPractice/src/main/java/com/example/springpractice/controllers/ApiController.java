package com.example.springpractice.controllers;

import com.example.springpractice.models.Alias;
import com.example.springpractice.models.dtos.ErrorResponseDTO;
import com.example.springpractice.models.dtos.GetAllAliasResponseDTO;
import com.example.springpractice.models.dtos.SaveAliasRequestDTO;
import com.example.springpractice.services.AliasServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//vrací json, rest je stateless
@RestController
@RequestMapping("/api")
public class ApiController {

    private final AliasServiceI aliasServiceI;

    @Autowired
    public ApiController(AliasServiceI aliasServiceI) {
        this.aliasServiceI = aliasServiceI;
    }

    @GetMapping("/links")
    public ResponseEntity<?> getLinks() {
        return ResponseEntity
                .ok()
                .body(aliasServiceI.getAll()
                        .stream()
                        .map(GetAllAliasResponseDTO::new)
                        .toList()
                );
    }

    @PostMapping("/links")
    public ResponseEntity<?> saveAll(@RequestBody SaveAliasRequestDTO dto){
        if (aliasServiceI.existByAlias(dto.getAlias())){
            return ResponseEntity
                    .status(400)
                    .body(new ErrorResponseDTO("už to tam je"));
        }
        Alias alias = aliasServiceI.save(dto.getAlias(), dto.getUrl());
        return ResponseEntity
                .ok(alias);
    }
}
