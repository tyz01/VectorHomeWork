package model;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExamTest {

    @Test
    public void testConstructorWithValidMarks() {
        int[] validMarks = {5, 4, 3, 2, 1};
        Exam exam = new Exam(validMarks);
        assertArrayEquals(validMarks, exam.getMarks());
    }

    @Test
    public void testConstructorWithInvalidMarks() {
        int[] invalidMarks = {5, 4, 3, 2, 0, 6};
        Exam exam = new Exam(invalidMarks);
        assertNull(exam.getMarks());
    }

    @Test
    public void testSetMarks() {
        int[] marks = {5, 4, 3, 2, 1};
        Exam exam = new Exam();
        exam.setMarks(marks);
        assertArrayEquals(marks, exam.getMarks());
    }

    @Test
    public void testToString() {
        int[] marks = {5, 4, 3, 2, 1};
        Exam exam = new Exam(marks);
        String expected = "Exam{marks=[5, 4, 3, 2, 1]}";
        assertEquals(expected, exam.toString());
    }
}