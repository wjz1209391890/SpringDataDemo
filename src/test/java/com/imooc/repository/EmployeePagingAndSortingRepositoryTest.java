package com.imooc.repository;

import com.imooc.domain.Employee;
import com.imooc.service.EmployeeService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public class EmployeePagingAndSortingRepositoryTest {
    private ApplicationContext ctx = null;
    private EmployeePagingAndSortingRepository employeePagingAndSortingRepository = null;

    @Before
    public void step() {
        ctx = new ClassPathXmlApplicationContext("beans-new.xml");
        employeePagingAndSortingRepository = ctx.getBean(EmployeePagingAndSortingRepository.class);
    }

    @After
    public void shuntdown() {
        ctx = null;
    }

    @Test
    public void testPage(){
        //index是从0开始的
        Pageable pageable = new PageRequest(0,9);
        Page<Employee> page = employeePagingAndSortingRepository.findAll(pageable);
        System.out.println("查询的总页数："+page.getTotalPages());
        System.out.println("查询的总记录数："+page.getTotalElements());
        System.out.println("查询的当前第几页："+(page.getNumber()+1));
        System.out.println("查询的当前页面的集合："+page.getContent());
        System.out.println("查询的当前页面的记录数："+page.getNumberOfElements());
    }
    @Test
    public void testSort(){
        Sort.Order order = new Sort.Order(Sort.Direction.DESC,"id");
        Pageable pageable = new PageRequest(0,5,new Sort(order));
        Page<Employee> page = employeePagingAndSortingRepository.findAll(pageable);
        System.out.println("查询的总页数："+page.getTotalPages());
        System.out.println("查询的总记录数："+page.getTotalElements());
        System.out.println("查询的当前第几页："+(page.getNumber()+1));
        System.out.println("查询的当前页面的集合："+page.getContent());
        System.out.println("查询的当前页面的记录数："+page.getNumberOfElements());
    }
}
