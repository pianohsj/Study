package com.springstudy.firstdemo.mapper;

import com.springstudy.firstdemo.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    void registerStudent(Student student);

    Student getStudentById(int id);

    List<Student> getAllStudents();

    void deleteStudentById(int id);

    void deleteAllStudents();
}
