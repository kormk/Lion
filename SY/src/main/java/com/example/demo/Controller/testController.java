package com.example.demo.Controller;


import com.example.demo.DTO.testDTO;
import com.example.demo.Service.testService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class testController {

    private static final Logger logger = LoggerFactory.getLogger(testController.class);
    private final testService testService;

    public testController(@Autowired testService testService) {
        this.testService = testService;
    }

    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<String> nullPointerExceptionControl(Exception e)
    {
        return ResponseEntity.status(400).body("NULL_POINTER_EXCEPTION");
    }




    @PostMapping(value = "/post")
    public testDTO testPost(@RequestBody testDTO user)
    {

        logger.info("전달 받은 값\n" + user + "\n");
        testDTO response = testService.setUserInfo(user);
        logger.info("반환 값 \n" + response + "\n" );

        return response;
    }

    @PutMapping(value = "/put")
    public testDTO testPut(@RequestBody testDTO user)
    {
        logger.info("전달 받은 값 \n" + user + "\n");
        testDTO response = testService.modifyUserInfo(user);
        logger.info("반환 값 \n" + response + "\n");

        return response;
    }


    @GetMapping(value = "/get/{id}")
    public testDTO testGet(@PathVariable("id") Long id)
    {

        logger.info("조회한 id: " + id + "\n");
        testDTO response = testService.getUserInfo(id);
        logger.info("조회된 값 \n" + response + "\n");

        return response;
    }

    @DeleteMapping(value = "/del/{id}")
    public String testDel(@PathVariable("id") Long id)
    {
        logger.info("삭제 할 id: " + id + "\n");
        return testService.delUserInfo(id);
    }


}

