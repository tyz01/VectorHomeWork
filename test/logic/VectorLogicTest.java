package logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class VectorLogicTest {

    @Test
    public void testIsSorted_PositiveOutcome() {
        int[] sortedVector = {1, 2, 3, 4, 5};
        assertTrue(VectorLogic.isSorted(sortedVector));
    }

    @Test
    public void testIsMirrored_PositiveOutcome() {
        int[] mirroredVector = {1, 2, 3, 2, 1};
        assertTrue(VectorLogic.isMirrored(mirroredVector));
    }

    @Test
    public void testAreAllElementsSame_PositiveOutcome() {
        int[] sameElementsVector = {2, 2, 2, 2};
        assertTrue(VectorLogic.areAllElementsSame(sameElementsVector));
    }

    @Test
    public void testCountEvenOddElements_PositiveOutcome() {
        int[] vector = {1, 2, 3, 4, 5, 6};
        assertEquals(3, VectorLogic.countEvenOddElements(vector, true));
        assertEquals(3, VectorLogic.countEvenOddElements(vector, false));
    }

    @Test
    public void testIsSorted_NegativeOutcome() {
        int[] sortedVector = {5, 4, 3, 2, 1};
        assertFalse(VectorLogic.isSorted(sortedVector));
    }

    @Test
    public void testIsMirrored_NegativeOutcome() {
        int[] mirroredVector = {1, 2, 3, 4, 5};
        assertFalse(VectorLogic.isMirrored(mirroredVector));
    }

    @Test
    public void testAreAllElementsSame_NegativeOutcome() {
        int[] sameElementsVector = {1, 2, 3, 4, 5};
        assertFalse(VectorLogic.areAllElementsSame(sameElementsVector));
    }

    @Test
    public void testCountEvenOddElements_NegativeOutcome() {
        int[] vector = {1, 2, 3, 4, 5, 6};
        assertNotEquals(4, VectorLogic.countEvenOddElements(vector, true));
        assertNotEquals(4, VectorLogic.countEvenOddElements(vector, false));
    }
}