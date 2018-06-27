package com.springstudy.firstdemo.service;

import com.springstudy.firstdemo.mapper.SubjectMapper;
import com.springstudy.firstdemo.model.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Repository
public class SubjectService {

    @Autowired
    SubjectMapper subjectMapper;

    public void addSubject(Subject subject) {
        subjectMapper.registerSubject(subject);
    }

    public Subject getSubjectById(int subjectId) {
        return subjectMapper.getSubjectById(subjectId);
    }

    public List<Subject> getAllSubjects() {
        return subjectMapper.getAllSubjects();
    }

    public void deleteSubject(int subjectId) {
        subjectMapper.deleteSubjectById(subjectId);
    }

    public void deleteAllSubjects() {
        subjectMapper.deleteAllSubjects();
    }
}
