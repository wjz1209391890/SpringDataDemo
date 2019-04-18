package com.imooc.dao;

import com.imooc.domain.Student;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class StudentDaoSpringJdbcImplTest {
    private ApplicationContext ctx = null;
    private StudentDao studentDao = null;
    @Before
    public void step(){
        ctx = new ClassPathXmlApplicationContext("beans.xml");
        studentDao = (StudentDao) ctx.getBean("studentDao");
    }
    @After
    public void shuntdown(){
        ctx = null;
    }
    @Test
    public void testQuery(){
        List<Student> query = studentDao.query();
        for (Student student:
             query) {
            System.out.println(student.toString());
        }
    }

    @Test
    public void testSave(){
        Student student = new Student();
        student.setName("dsdadasdasdasda");
        student.setAge("40");
        studentDao.save(student);
    }
}
