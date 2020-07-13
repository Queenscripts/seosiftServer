package com.example.seo.model;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Article {
    private final UUID id;
    private final String name;

    public Article(@JsonProperty("id") UUID id,
                  @JsonProperty("title") String title,
                  @JsonProperty("description") String description){
        this.id= id;
        this.title= title;
        this.description= description;
    }
    public UUID getId(){
        return id;
    }
    public String getName(){
        return title;
    }
    public String getDescription(){
        return description;
    }

}