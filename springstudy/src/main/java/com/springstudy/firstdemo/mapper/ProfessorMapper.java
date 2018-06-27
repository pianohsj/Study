package com.springstudy.firstdemo.mapper;

import com.springstudy.firstdemo.model.Professor;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ProfessorMapper {
    void registerProfessor(Professor professor);

    Professor getProfessorById(int id);

    List<Professor> getAllProfessors();

    void deleteProfessorById(int id);

    void deleteAllProfessors();
}
