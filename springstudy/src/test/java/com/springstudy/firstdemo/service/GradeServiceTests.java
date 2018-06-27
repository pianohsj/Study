package com.springstudy.firstdemo.service;

import com.springstudy.firstdemo.model.Grade;
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
public class GradeServiceTests {

    @Autowired
    GradeService gradeService;

    @Before
    public void setUp() throws Exception {
        gradeService.deleteAllGrades();
    }

    @Test
    public void addAndGetGradeTest() {
        Grade grade1 = new Grade("A+", 1, 1);
        Grade grade2 = new Grade("C+", 3, 3);

        gradeService.addGrade(grade1);
        gradeService.addGrade(grade2);
        assertThat(gradeService.getAllGrades().size(), is(2));

        Grade gradeGet1 = gradeService.getGradeByStudent(1);
        assertThat(gradeGet1.getScore(), is(grade1.getScore()));
		
        Grade gradeGet2 = gradeService.getGradeBySubject(3);
        assertThat(gradeGet2.getScore(), is(grade2.getScore()));
    }

    @Test
    public void deleteGradeTest() {
        Grade grade1 = new Grade("A+", 1, 1);
        Grade grade2 = new Grade("B+", 3, 3);
        Grade grade3 = new Grade("C+", 3, 1);

        gradeService.addGrade(grade1);
        gradeService.addGrade(grade2);
        gradeService.addGrade(grade3);
        assertThat(gradeService.getAllGrades().size(), is(3));

        gradeService.deleteGrade(grade1);
        assertThat(gradeService.getAllGrades().size(), is(2));

        Grade gradeGet1 = gradeService.getGradeByStudent(1);
        assertTrue(gradeGet1 == null);
    }
}
