package logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExamLogicTest {

    @Test
    public void testDisplayExamResults() {
        int[] examResults = {0, 1, 7, 0, 10, 12};

        ExamLogic.displayExamResults(examResults);

        String expectedOutput = """
                Exam Result:
                5 - 40.0% (12)
                4 - 33.3% (10)
                3 - 23.3% (7)
                2 - 0.0% (0)
                1 - 0.0% (0)
                """;
        System.out.println(expectedOutput);
      //  String actualOutput = outputStream.toString();

       // assertEquals(expectedOutput, actualOutput);
    }
    @Test
    public void testProcessExamResults_PositiveOutcome() {
        int[] marks = {1, 2, 3, 4, 5, 5, 4, 3, 2, 1};
        int[] expectedResults = {0, 2, 2, 2, 2, 2};

        int[] actualResults = VectorLogic.processExamResults(marks);

        assertArrayEquals(expectedResults, actualResults);
    }

    @Test
    public void testProcessExamResults_NegativeOutcome() {
        int[] marks = {};
        int[] expectedResults = {0, 0, 0, 0, 0, 0};

        int[] actualResults = VectorLogic.processExamResults(marks);

        assertArrayEquals(expectedResults, actualResults);
    }
}