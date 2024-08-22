package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    StudentList studentList;
    @BeforeEach
    void setup() {
        studentList = new StudentList();
    }

    @Test
    void testAddStudent() {
        studentList.addNewStudent("6610402205", "Nest");
        assertNotNull(studentList.findStudentById("6610402205"));
    }

    @Test
    void testfindStudentById() {
        studentList.addNewStudent("6610402205", "Nest");
        assertNotNull(studentList.findStudentById("6610402205"));
    }

    @Test
    void testGivescoreToId() {
        studentList.addNewStudent("6610402205", "Nest");
        studentList.giveScoreToId("6610402205", 50);
        assertEquals(50, studentList.findStudentById("6610402205").getScore());
    }

    @Test
    void testViewGradeOfId() {
        studentList.addNewStudent("6610402205", "Nest", 80);
        assertEquals("A", studentList.viewGradeOfId("6610402205"));
    }

    @Test
    void testGetStudent() {
        studentList.addNewStudent("6610402205", "Nest");
        ArrayList<Student> actual = studentList.getStudents();
        String expected = "java.util.ArrayList";
        assertEquals(expected, actual.getClass().getName());
    }

}