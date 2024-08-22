package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student s1;
    @BeforeEach
    void setUp() {
        s1 = new Student("6610402205", "kong");
    }
    @Test
    void testAddScore() {
        s1.addScore(40);
        assertEquals(40, s1.getScore());
        s1.addScore(30);
        assertEquals(70, s1.getScore());
    }

    @Test
    void testCalculateGrade() {
        s1.addScore(65);
        assertEquals("C", s1.grade());
    }

    @Test
    void testIsId() {
        s1.isId("6610402205");
        assertEquals(true, s1.isId("6610402205"));
    }

    @Test
    void testChangeName() {
        s1.changeName("Nest");
        assertEquals("Nest", s1.getName());
    }
}