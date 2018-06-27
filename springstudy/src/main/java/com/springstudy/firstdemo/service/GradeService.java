package com.springstudy.firstdemo.service;

import com.springstudy.firstdemo.mapper.GradeMapper;
import com.springstudy.firstdemo.model.Grade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Repository
public class GradeService {

    @Autowired
    GradeMapper gradeMapper;

    public void addGrade(Grade grade) {
        gradeMapper.registerGrade(grade);
    }

    public Grade getGradeByStudent(int studentId) {
        return gradeMapper.getGradeByStudent(studentId);
    }
    
    public Grade getGradeBySubject(int subjectId) {
        return gradeMapper.getGradeBySubject(subjectId);
    }

    public List<Grade> getAllGrades() {
        return gradeMapper.getAllGrades();
    }

    public void deleteGrade(Grade grade) {
        gradeMapper.deleteGradeByStudentAndSubject(grade);
    }

    public void deleteAllGrades() {
        gradeMapper.deleteAllGrades();
    }
}
