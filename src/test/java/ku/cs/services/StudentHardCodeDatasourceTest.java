package ku.cs.services;

import ku.cs.models.StudentList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentHardCodeDatasourceTest {
    private StudentHardCodeDatasource ds = new StudentHardCodeDatasource();
    @Test
    void testReadData(){
        StudentList list = ds.readData();
        list.giveScoreToId("6710400002",100);
        assertEquals("A",list.findStudentById("6710400002").getGrade());
        assertEquals("First",list.findStudentById("6710400001").getName());
        assertEquals(4,list.getStudents().size());
    }



}