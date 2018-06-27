package com.springstudy.firstdemo.service;

import com.springstudy.firstdemo.mapper.UserMapper;
import com.springstudy.firstdemo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Repository
public class UserService {

    @Autowired
    UserMapper userMapper;

    public void addStudent(Student student) {
        userMapper.registerStudent(student);
    }

    public Student getStudentById(int studentId) {
        return userMapper.getStudentById(studentId);
    }

    public List<Student> getAllStudents() {
        return userMapper.getAllStudents();
    }

    public void deleteStudent(int studentId) {
        userMapper.deleteStudentById(studentId);
    }

    public void deleteAllStudents() {
        userMapper.deleteAllStudents();
    }
}
