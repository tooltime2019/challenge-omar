package com.omaryaya.practiceapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "models")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Model {

    private String id;
    private String name;
}
