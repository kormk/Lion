package com.example.demo.DTO;


import com.example.demo.Entity.testEntity;
import lombok.*;

@Getter@Setter
@AllArgsConstructor @NoArgsConstructor
@ToString

public class testDTO {
    Long id;
    String name;
    String password;

    @Builder
    public testEntity toEntity()
    {
        return new testEntity(this.name, this.password);
    }

    @Builder
    public testDTO(String name, String pw)
    {
        this.name = name;
        this.password = pw;
    }
}
