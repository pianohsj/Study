package com.springstudy.firstdemo.mapper;

import com.springstudy.firstdemo.model.Subject;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SubjectMapper {
    void registerSubject(Subject subject);

    Subject getSubjectById(int id);

    List<Subject> getAllSubjects();

    void deleteSubjectById(int id);

    void deleteAllSubjects();
}
