package com.imooc.dao;

import com.imooc.domain.Student;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class SpringDataTest {
    private ApplicationContext ctx = null;
    @Before
    public void step(){
        ctx = new ClassPathXmlApplicationContext("beans-new.xml");
    }
    @After
    public void shuntdown(){
        ctx = null;
    }
    @Test
    public void testEntityManagerFactory(){

    }

}
