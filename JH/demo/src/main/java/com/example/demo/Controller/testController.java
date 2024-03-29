package com.example.demo.Controller;

import com.example.demo.Service.testService;

import com.example.demo.DTO.testDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    public final testService testService;

    public testController(@Autowired testService testService){
        this.testService = testService;
    }


    @GetMapping(value = "test/{id}")
    public testDTO testPut(@RequestBody testDTO user){
        return testService.testService(user);
    }



}
