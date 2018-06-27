package com.springstudy.firstdemo.mapper;

import com.springstudy.firstdemo.model.Grade;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface GradeMapper {
    void registerGrade(Grade grade);

    Grade getGradeByStudent(int student_id);
    
    Grade getGradeBySubject(int subject_id);

    List<Grade> getAllGrades();

    void deleteGradeByStudentAndSubject(Grade grade);

    void deleteAllGrades();
}
