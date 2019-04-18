package com.imooc.service;

import com.imooc.repository.EmployeeRepository;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeServiceTest {
    private ApplicationContext ctx = null;
    private EmployeeService employeeService = null;

    @Before
    public void step() {
        ctx = new ClassPathXmlApplicationContext("beans-new.xml");
        employeeService = ctx.getBean(EmployeeService.class);
    }

    @After
    public void shuntdown() {
        ctx = null;
    }

    @Test
    public void testUpdate() {
        employeeService.update(52,30);
    }
}
