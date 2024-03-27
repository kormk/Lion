package com.example.demo.Service;

import com.example.demo.DTO.testDTO;
import org.springframework.stereotype.Service;


@Service
public class testService {
    public testDTO testService(testDTO dto){
        dto.setName("fix name");
        dto.setId("fix id");
        dto.setPassword("fix password");

        return dto;
    }
}
