package com.example.demo.DAO;

import com.example.demo.Entity.testEntity;

public interface testDAO {
    testEntity getUserinfo(Long id);
    testEntity setUserInfo(testEntity entity);
    testEntity modifyUserInfo(testEntity entity);
    void delUserInfo(Long id);
}
