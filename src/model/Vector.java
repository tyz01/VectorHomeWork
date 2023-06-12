package model;

import java.util.Arrays;

public class Vector {
    private int [] elementVector;

    public Vector(int[] elementVector) {
        this.elementVector = elementVector;
    }

    public Vector() {

    }

    public int[] getElementVector() {
        return elementVector;
    }

    public void setElementVector(int[] elementVector) {
        this.elementVector = elementVector;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "elementVector=" + Arrays.toString(elementVector) +
                '}';
    }
}
