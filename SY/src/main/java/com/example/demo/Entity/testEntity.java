package com.example.demo.Entity;


import com.example.demo.DTO.testDTO;
import javax.persistence.*;
import lombok.*;


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
