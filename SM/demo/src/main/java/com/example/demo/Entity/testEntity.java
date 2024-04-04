package com.example.demo.Entity;


import com.example.demo.DTO.testDTO;
import jakarta.persistence.*;
import lombok.*;

//DTO는 값은 전달해주는 객체, 엔티티는 데이터베이스에 직접 연결되는 객체
@Entity
@Getter @Setter @ToString
@NoArgsConstructor@AllArgsConstructor
@Table(name = "TEST_TABLE")
public class testEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TEST_ID")
    Long id;

    String name;

    String password;


    @Builder
    public testEntity(String name, String password)
    {
        this.name = name;
        this.password = password;
    }

    @Builder
    public testDTO toDTO()
    {
        return new testDTO(this.name, this.password);
    }

    @Builder
    public testDTO toDTOWithId(){return new testDTO(this.id, this.name, this.password);}
}
