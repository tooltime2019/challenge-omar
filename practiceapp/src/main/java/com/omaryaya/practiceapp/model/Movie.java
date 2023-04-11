package com.omaryaya.practiceapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document(collection = "movies")
@AllArgsConstructor
@NoArgsConstructor
public class Movie {

    @JsonProperty
    private String id;
    @JsonProperty
    private String title;
    @JsonProperty
    private String description;
    @JsonProperty
    private List<String> genres;
}
