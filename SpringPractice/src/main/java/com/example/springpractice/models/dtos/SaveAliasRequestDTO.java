package com.example.springpractice.models.dtos;

import com.example.springpractice.models.Alias;

public class SaveAliasRequestDTO {
    private String url;
    private String alias;

    public SaveAliasRequestDTO(Alias a) {
        this.url = a.getUrl();
        this.alias = a.getAlias();
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
}
