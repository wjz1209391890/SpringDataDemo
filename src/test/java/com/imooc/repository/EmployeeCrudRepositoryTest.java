package com.imooc.repository;

import com.imooc.domain.Employee;
import com.imooc.service.EmployeeService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class EmployeeCrudRepositoryTest {
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
    public void testFindByName() {
        List<Employee> employees = new ArrayList<>();
        Employee employee = null;
        for(int i=0;i<100;i++){
            employee = new Employee();
            employee.setAge(100-i);
            employee.setName("test"+i);
            employees.add(employee);
        }
        employeeService.save(employees);
    }




}
