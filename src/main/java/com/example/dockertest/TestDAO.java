package com.example.dockertest;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestDAO extends MongoRepository<SomeData, String> {
    SomeData findByName(String name);
}
