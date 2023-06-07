package logic;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class VectorProgramTest {

    @Test
    public void isSorted() {
        int[] sortedVector = {1, 2, 3, 4, 5};
        int[] unsortedVector = {3, 1, 2, 5, 4};
        Assert.assertTrue(VectorProgram.isSorted(sortedVector));
        Assert.assertFalse(VectorProgram.isSorted(unsortedVector));
    }

    @Test
    public void isMirrored() {
        int[] mirroredVector = {1, 2, 3, 2, 1};
        int[] nonMirroredVector = {1, 2, 3, 4, 5};

        Assert.assertTrue(VectorProgram.isMirrored(mirroredVector));
        Assert.assertFalse(VectorProgram.isMirrored(nonMirroredVector));

    }

    @Test
    public void areAllElementsSame() {
        int[] sameElementsVector = {2, 2, 2, 2};
        int[] differentElementsVector = {1, 2, 3, 4, 5};

        Assert.assertTrue(VectorProgram.areAllElementsSame(sameElementsVector));
        Assert.assertFalse(VectorProgram.areAllElementsSame(differentElementsVector));

    }

    @Test
    public void countEvenOddElements() {
        int[] vector = {1, 2, 3, 4, 5, 6};

        Assert.assertEquals(3, VectorProgram.countEvenOddElements(vector, true));
        Assert.assertEquals(3, VectorProgram.countEvenOddElements(vector, false));

    }

    @Test
    public void processExamResults() {
        int[] marks = {1, 2, 1, 2};

        VectorProgram.processExamResults(marks);

    }
}