package com.example.springpractice.models.dtos;

import com.example.springpractice.models.Alias;

public class GetAllAliasResponseDTO {

    private Long id;
    private String url;
    private String alias;
    private int hitCount;

    public GetAllAliasResponseDTO(Alias a) {
        this.id = a.getId();
        this.url = a.getUrl();
        this.alias = a.getAlias();
        this.hitCount = a.getHitCount();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getHitCount() {
        return hitCount;
    }

    public void setHitCount(int hitCount) {
        this.hitCount = hitCount;
    }
}
