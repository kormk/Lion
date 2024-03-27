package com.example.demo.Controller;

import com.example.demo.DTO.testDTO;
import com.example.demo.Service.testService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
public class testController {

    // dependency injection DI
    private final testService testService;

    public testController(@Autowired testService testService){
        this.testService = testService;
    }

    @GetMapping(value = "/test/{user}")
    public testDTO testPut(@RequestBody testDTO user){
        return testService.testService(user);
    }
}
