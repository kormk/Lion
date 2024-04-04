package com.example.demo.Repository;
import com.example.demo.Entity.testEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface testRepository extends JpaRepository<testEntity,Long>{
    testEntity getById(Long id);
}
