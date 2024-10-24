package com.example.dockertest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {
    @Autowired
    private TestService testService;

    @GetMapping
    public String getMainPage(){
        return "Hello world !";
    }

    @GetMapping("/devops")
    public String getDevops(){
        return "Variable DEVOPS is " + System.getenv("DEVOPS");
    }

    @GetMapping("/testdata")
    public List<SomeData> getTestData(){
        return testService.getAllDocuments();
    }
}
