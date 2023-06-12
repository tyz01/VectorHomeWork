package model;

import org.junit.Test;

import static org.junit.Assert.*;

public class VectorTest {


    @Test
    public void testConstructorWithValidArray() {
        int[] validArray = {1, 2, 3, 4, 5};
        Vector vector = new Vector(validArray);
        assertArrayEquals(validArray, vector.getElementVector());
    }

    @Test
    public void testConstructorWithEmptyArray() {
        int[] emptyArray = {};
        Vector vector = new Vector(emptyArray);
        assertArrayEquals(emptyArray, vector.getElementVector());
    }

    @Test
    public void testSetElementVector() {
        int[] array = {1, 2, 3, 4, 5};
        Vector vector = new Vector();
        vector.setElementVector(array);
        assertArrayEquals(array, vector.getElementVector());
    }

    @Test
    public void testToString() {
        int[] array = {1, 2, 3, 4, 5};
        Vector vector = new Vector(array);
        String expected = "Vector{elementVector=[1, 2, 3, 4, 5]}";
        assertEquals(expected, vector.toString());
    }
}