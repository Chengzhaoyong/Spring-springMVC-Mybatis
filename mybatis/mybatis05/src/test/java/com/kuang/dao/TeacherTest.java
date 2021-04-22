package com.kuang.dao;

import com.kuang.pojo.Teacher;
import com.kuang.utils.utilMybatis;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TeacherTest {

   SqlSession sqlSession= utilMybatis.getSession();
   TeacherMapper mapper= sqlSession.getMapper(TeacherMapper.class);

    @Test
    public void getTeacher(){
        List<Teacher> teachers = mapper.getTeacher(1);
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }
}
