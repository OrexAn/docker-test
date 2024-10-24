package com.example.dockertest;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@Document(collection = "documents")
public class SomeData {
    @Id
    private String id;
    private String name;
    private String description;
}
