package logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class VetorLogicTest {

    @Test
    public void testIsSorted_PositiveOutcome() {
        int[] sortedVector = {1, 2, 3, 4, 5};
        assertTrue(VetorLogic.isSorted(sortedVector));
    }

    @Test
    public void testIsMirrored_PositiveOutcome() {
        int[] mirroredVector = {1, 2, 3, 2, 1};
        assertTrue(VetorLogic.isMirrored(mirroredVector));
    }

    @Test
    public void testAreAllElementsSame_PositiveOutcome() {
        int[] sameElementsVector = {2, 2, 2, 2};
        assertTrue(VetorLogic.areAllElementsSame(sameElementsVector));
    }

    @Test
    public void testCountEvenOddElements_PositiveOutcome() {
        int[] vector = {1, 2, 3, 4, 5, 6};
        assertEquals(3, VetorLogic.countEvenOddElements(vector, true));
        assertEquals(3, VetorLogic.countEvenOddElements(vector, false));
    }

    @Test
    public void testIsSorted_NegativeOutcome() {
        int[] sortedVector = {5, 4, 3, 2, 1};
        assertFalse(VetorLogic.isSorted(sortedVector));
    }

    @Test
    public void testIsMirrored_NegativeOutcome() {
        int[] mirroredVector = {1, 2, 3, 4, 5};
        assertFalse(VetorLogic.isMirrored(mirroredVector));
    }

    @Test
    public void testAreAllElementsSame_NegativeOutcome() {
        int[] sameElementsVector = {1, 2, 3, 4, 5};
        assertFalse(VetorLogic.areAllElementsSame(sameElementsVector));
    }

    @Test
    public void testCountEvenOddElements_NegativeOutcome() {
        int[] vector = {1, 2, 3, 4, 5, 6};
        assertNotEquals(4, VetorLogic.countEvenOddElements(vector, true));
        assertNotEquals(4, VetorLogic.countEvenOddElements(vector, false));
    }
    @Test
    public void testProcessExamResults_PositiveOutcome() {
        int[] marks = {1, 2, 3, 4, 5, 5, 4, 3, 2, 1};
        int[] expectedResults = {0, 2, 2, 2, 2, 2};

        int[] actualResults = VetorLogic.processExamResults(marks);

        assertArrayEquals(expectedResults, actualResults);
    }

    @Test
    public void testProcessExamResults_NegativeOutcome() {
        int[] marks = {};
        int[] expectedResults = {0, 0, 0, 0, 0, 0};

        int[] actualResults = VetorLogic.processExamResults(marks);

        assertArrayEquals(expectedResults, actualResults);
    }
}