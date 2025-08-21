package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    private StudentList list;
    @BeforeEach
    void setUp() {
        list = new StudentList();
        list.addNewStudent("6710400001", "First");
        list.addNewStudent("6710400002", "Second");
        list.addNewStudent("6710400003", "Third");
        list.addNewStudent("6710400004", "Fourth");
    }

    @Test
    void testAddNewStudent() {
        list.addNewStudent("67104999999", "Ftest",10);
        assertEquals(10,list.findStudentById("67104999999").getScore());
    }

    @Test
    void testFindStudentById() {
        assertNotNull(list.findStudentById("6710400001"));
    }

    @Test
    void testFilterByName() {
        list.addNewStudent("6710400101", "z1");
        list.addNewStudent("6710400102", "z2");
        list.addNewStudent("6710400103", "z3");

        assertEquals(3,list.filterByName("z").getStudents().size());
    }

    @Test
    void testGiveScoreToId(){
        list.giveScoreToId("6710400001",100);
        assertEquals(100,list.findStudentById("6710400001").getScore());
    }

    @Test
    void viewGradeOfId(){
        list.giveScoreToId("6710400001",100);
        assertEquals("A",list.findStudentById("6710400001").getGrade());
    }

}