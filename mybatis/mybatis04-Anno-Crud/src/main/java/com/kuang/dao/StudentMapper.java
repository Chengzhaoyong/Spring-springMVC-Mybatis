package com.kuang.dao;

import com.kuang.pojo.Student;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StudentMapper {

    List<Student> getStudent();

    List<Student> getStudents();
}
