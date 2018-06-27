package com.springstudy.firstdemo.service;

import com.springstudy.firstdemo.model.Student;
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
public class UserServiceTests {

    @Autowired
    UserService userService;

    @Before
    public void setUp() throws Exception {
        userService.deleteAllStudents();
    }

    @Test
    public void addAndGetStudentTest() {
        Student student1 = new Student(1, "이성경", "900810");
        Student student2 = new Student(2, "이지은", "930516");

        userService.addStudent(student1);
        userService.addStudent(student2);
        assertThat(userService.getAllStudents().size(), is(2));

        Student studentGet1 = userService.getStudentById(1);
        assertThat(studentGet1.getName(), is(student1.getName()));
		
        Student studentGet2 = userService.getStudentById(2);
        assertThat(studentGet2.getName(), is(student2.getName()));
    }

    @Test
    public void deleteStudentTest() {
        Student student1 = new Student(1, "이성경", "900810");
        Student student2 = new Student(2, "이지은", "930516");
        Student student3 = new Student(3, "김사랑", "780112");

        userService.addStudent(student1);
        userService.addStudent(student2);
        userService.addStudent(student3);
        assertThat(userService.getAllStudents().size(), is(3));

        userService.deleteStudent(2);
        assertThat(userService.getAllStudents().size(), is(2));

        Student studentGet1 = userService.getStudentById(2);
        assertTrue(studentGet1 == null);
    }
}
