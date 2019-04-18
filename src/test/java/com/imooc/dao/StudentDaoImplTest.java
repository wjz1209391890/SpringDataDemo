package com.imooc.dao;

import com.imooc.domain.Student;
import org.junit.Test;

import java.util.List;

public class StudentDaoImplTest {
    @Test
    public void testQuery(){
        StudentDao studentDao = new StudentDaoImpl();
        List<Student> query = studentDao.query();
        for (Student student:
             query) {
            System.out.println(student.toString());
        }
    }

    @Test
    public void testSave(){
        Student student = new Student();
        student.setName("xsxs");
        student.setAge("22");
        StudentDao studentDao = new StudentDaoImpl();
        studentDao.save(student);
    }
}
