package com.springstudy.firstdemo.service;

import com.springstudy.firstdemo.model.Professor;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProfessorServiceTests {

    @Autowired
    ProfessorService professorService;

    @Before
    public void setUp() throws Exception {
        professorService.deleteAllProfessors();
    }

    @Test
    public void addAndGetProfessorTest() {
        Professor professor1 = new Professor(1, "이교수", "870620");
        Professor professor2 = new Professor(2, "김교수", "740112");

        professorService.addProfessor(professor1);
        professorService.addProfessor(professor2);
        assertThat(professorService.getAllProfessors().size(), is(2));

        Professor professorGet1 = professorService.getProfessorById(1);
        assertThat(professorGet1.getName(), is(professor1.getName()));
		
        Professor professorGet2 = professorService.getProfessorById(2);
        assertThat(professorGet2.getName(), is(professor2.getName()));
    }

    @Test
    public void deleteProfessorTest() {
        Professor professor1 = new Professor(1, "이교수", "870820");
        Professor professor2 = new Professor(2, "김교수", "740112");
        Professor professor3 = new Professor(3, "한교수", "780322");

        professorService.addProfessor(professor1);
        professorService.addProfessor(professor2);
        professorService.addProfessor(professor3);
        assertThat(professorService.getAllProfessors().size(), is(3));

        professorService.deleteProfessor(2);
        assertThat(professorService.getAllProfessors().size(), is(2));

        Professor professorGet1 = professorService.getProfessorById(2);
        assertTrue(professorGet1 == null);
    }
}
