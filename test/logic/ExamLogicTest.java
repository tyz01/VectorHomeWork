package logic;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class ExamLogicTest {

    @Test
    public void testDisplayExamResults() { //don't work
        int[] examResults = {1, 2, 3, 4, 5};

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        ExamLogic.displayExamResults(examResults);

        String expectedOutput = """
                Exam Result:
                5 - 16,7% (1)
                4 - 16,7% (1)
                3 - 16,7% (1)
                2 - 16,7% (1)
                1 - 16,7% (1)
                """;

        String actualOutput = outputStream.toString();

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testProcessExamResults_PositiveOutcome() {
        int[] marks = {1, 2, 3, 4, 5, 5, 4, 3, 2, 1};
        int[] expectedResults = {0, 2, 2, 2, 2, 2};

        int[] actualResults = ExamLogic.processExamResults(marks);

        assertArrayEquals(expectedResults, actualResults);
    }

    @Test
    public void testProcessExamResults_NegativeOutcome() {
        int[] marks = {};
        int[] expectedResults = {0, 0, 0, 0, 0, 0};

        int[] actualResults = ExamLogic.processExamResults(marks);

        assertArrayEquals(expectedResults, actualResults);
    }
}