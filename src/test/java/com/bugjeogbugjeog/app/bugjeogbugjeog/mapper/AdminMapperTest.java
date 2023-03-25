package com.bugjeogbugjeog.app.bugjeogbugjeog.mapper;


import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
@Slf4j
public class AdminMapperTest {

    @Autowired
    AdminMapper adminMapper;

    @Test
    public void selectAll(){
        adminMapper.selectAll();
    }
}
