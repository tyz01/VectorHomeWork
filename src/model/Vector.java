package model;

import java.util.Arrays;

public class Vector {
    private int [] elementVector;

    public Vector(int[] elementVector) {
        if(elementVector.length == 0){
            System.out.println("elementVector is empty");
        }
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
