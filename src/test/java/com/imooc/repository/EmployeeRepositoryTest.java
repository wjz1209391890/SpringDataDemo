package com.imooc.repository;

import com.imooc.domain.Employee;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryTest {
    private ApplicationContext ctx = null;
    private EmployeeRepository employeeRepository = null;

    @Before
    public void step() {
        ctx = new ClassPathXmlApplicationContext("beans-new.xml");
        employeeRepository = ctx.getBean(EmployeeRepository.class);
    }

    @After
    public void shuntdown() {
        ctx = null;
    }

    @Test
    public void testFindByName() {
        Employee employee = employeeRepository.findByName("zhangsan");
        System.out.println(employee.toString());
    }

    @Test
    public void testFindByNameStartingWithAndAgeLessThan() {
        List<Employee> employees = employeeRepository.findByNameStartingWithAndAgeLessThan("test", 21);
        for (Employee employee :
                employees) {
            System.out.println(employee.toString());
        }
    }

    @Test
    public void testFindByNameEndingWithAndAgeLessThan() {
        List<Employee> employees = employeeRepository.findByNameEndingWithAndAgeLessThan("6", 23);
        for (Employee employee :
                employees) {
            System.out.println(employee.toString());
        }
    }

    @Test
    public void testFindByNameInOrAgeIsLessThan() {
        List<String> names = new ArrayList<>();
        names.add("test1");
        names.add("test2");
        names.add("test3");
        List<Employee> employees = employeeRepository.findByNameInOrAgeLessThan(names, 22);
        for (Employee employee :
                employees) {
            System.out.println(employee.toString());
        }
    }

    @Test
    public void testFindByNameInAndAgeLessThan() {
        List<String> names = new ArrayList<>();
        names.add("test1");
        names.add("test2");
        names.add("test3");
        List<Employee> employees = employeeRepository.findByNameInAndAgeLessThan(names, 22);
        for (Employee employee :
                employees) {
            System.out.println(employee.toString());
        }
    }

    @Test
    public void testGetEmployeeByMaxId() {
        Employee employee = employeeRepository.getEmployeeByMaxId();
        System.out.println(employee.toString());
    }

    @Test
    public void testqueryParams1() {
        List<Employee> employees = employeeRepository.queryParams1("test1`", 20);
        for (Employee employee :
                employees) {
            System.out.println(employee.toString());
        }
    }

    @Test
    public void testqueryParams2() {
        List<Employee> employees = employeeRepository.queryParams2("test1`", 20);
        for (Employee employee :
                employees) {
            System.out.println(employee.toString());
        }
    }

    @Test
    public void testqueryLike1() {
        List<Employee> employees = employeeRepository.queryLike1("test1");
        for (Employee employee :
                employees) {
            System.out.println(employee.toString());
        }
    }

    @Test
    public void testqueryLike2() {
        List<Employee> employees = employeeRepository.queryLike2("test1");
        for (Employee employee :
                employees) {
            System.out.println(employee.toString());
        }
    }
    @Test
    public void testgetCount() {
        long num = employeeRepository.getCount();
            System.out.println(num);
    }
    @Test
    public void testupdate() {
        employeeRepository.update(52,32);
    }
}
