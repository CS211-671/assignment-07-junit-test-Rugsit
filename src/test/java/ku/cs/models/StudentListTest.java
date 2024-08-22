package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    StudentList studentList;
    @BeforeEach
    void setup() {
        studentList = new StudentList();
    }

    @Test
    void testAddStudent() {
        studentList.addNewStudent("6xxxxxxxxx", "Nest");
        System.out.println(studentList);
        assertTrue(studentList.getStudents().contains("6xxxxxxxxx"));
    }

}