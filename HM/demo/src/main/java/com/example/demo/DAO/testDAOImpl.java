package com.example.demo.DAO;

import com.example.demo.Entity.testEntity;
import com.example.demo.Repository.testRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class testDAOImpl implements testDAO{
    private final testRepository testRepository;

    public testDAOImpl(@Autowired testRepository testRepository) {
        this.testRepository = testRepository;
    }

    @Override
    public testEntity getUserInfo(Long id) {
        return testRepository.getById(id);
    }

    @Override
    public testEntity setUserInfo(testEntity entity) {
        return testRepository.save(entity);
    }

    @Override
    public testEntity modifyUserInfo(testEntity entity) {
        return testRepository.save(entity);
    }

    @Override
    public void delUserInfo(Long id) {
        testRepository.deleteById(id);
    }
}
