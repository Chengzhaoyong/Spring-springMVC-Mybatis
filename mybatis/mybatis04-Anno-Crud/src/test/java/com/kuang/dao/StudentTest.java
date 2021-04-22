package com.kuang.dao;

import com.kuang.pojo.Student;
import com.kuang.utils.utilMybatis;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class StudentTest {
   SqlSession sqlSession= utilMybatis.getSession();

   StudentMapper mapper= sqlSession.getMapper(StudentMapper.class);

    @Test
    public void getStudent(){
        List<Student> students = mapper.getStudent();
        for (Student student:students){
            System.out.println(student);
        }

    }

    @Test
    public void getStudent2(){
        List<Student> students = mapper.getStudents();
        for (Student student:students){
            System.out.println(student);
        }

    }
}
