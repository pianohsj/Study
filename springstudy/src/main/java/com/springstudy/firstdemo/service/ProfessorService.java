package com.springstudy.firstdemo.service;

import com.springstudy.firstdemo.mapper.ProfessorMapper;
import com.springstudy.firstdemo.model.Professor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Repository
public class ProfessorService {

    @Autowired
    ProfessorMapper professorMapper;

    public void addProfessor(Professor professor) {
        professorMapper.registerProfessor(professor);
    }

    public Professor getProfessorById(int professorId) {
        return professorMapper.getProfessorById(professorId);
    }

    public List<Professor> getAllProfessors() {
        return professorMapper.getAllProfessors();
    }

    public void deleteProfessor(int professorId) {
        professorMapper.deleteProfessorById(professorId);
    }

    public void deleteAllProfessors() {
        professorMapper.deleteAllProfessors();
    }
}
