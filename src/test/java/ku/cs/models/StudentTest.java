package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    private Student student;
    @BeforeEach
    void init() {
        student = new Student("67104049884","John Pork");
    }

    @Test
    void testAddScore(){
        Student s = new Student("6xxxxxxxx", "StudentTest");
        s.addScore(45.15);
        assertEquals(45.15, s.getScore());

    }

    @Test
    void testCalculateGrade(){
        Student s = new Student("6xxxxxxxxx", "StudentTest");
        s.addScore(85);
        assertEquals("A", s.grade());
    }

    @Test
    void testChangeName(){
        student.changeName("John Pork the Second");
        assertEquals("John Pork the Second", student.getName());
    }

    @Test
    void  testIsId(){
        assertEquals(true, student.isId("67104049884"));
    }

    @Test
    void testIsNameContains(){
        assertEquals(true, student.isNameContains("pork"));
    }

    @Test
    void testToString(){
        assertEquals("{id: '67104049884', name: 'John Pork', score: 0.0}", student.toString());
    }

}