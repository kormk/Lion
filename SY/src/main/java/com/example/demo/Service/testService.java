package com.example.demo.Service;


import com.example.demo.DAO.testDAO;
import com.example.demo.DTO.testDTO;
import com.example.demo.Entity.testEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class testService {

    private final testDAO testDAO;

    public testService(@Autowired testDAO testDAO) {
        this.testDAO = testDAO;
    }

    public testDTO getUserInfo(Long id)
    {
        return testDAO.getUserinfo(id).toDTO();
    }

    public String delUserInfo(Long id)
    {
        testDAO.delUserInfo(id);
        return "del";
    }

    public testDTO modifyUserInfo(testDTO dto)
    {
        testEntity oldEntity = testDAO.getUserinfo(dto.getId());
        oldEntity.setName(dto.getName());
        oldEntity.setPassword(dto.getPassword());

        return testDAO.modifyUserInfo(oldEntity).toDTOWithId();
    }

    public testDTO setUserInfo(testDTO dto)
    {
        return testDAO.setUserInfo(dto.toEntity()).toDTO();
    }
}
