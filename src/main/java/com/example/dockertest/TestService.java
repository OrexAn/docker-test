package com.example.dockertest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    @Autowired
    private TestDAO testDAO;
    public List<SomeData> getAllDocuments() {
        return testDAO.findAll();
    }

    public SomeData getSomeDataByName(String name) {
        return testDAO.findByName(name);
    }

    public SomeData saveSomeData(SomeData someData) {
        return testDAO.save(someData);
    }
}
