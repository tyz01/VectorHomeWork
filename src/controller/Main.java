package controller;

import static logic.VectorProgram.*;

public class Main {
    public static void main(String[] args) {
        int[] vector = {1, 2, 3, 2, 1};

        boolean isSorted = isSorted(vector);
        boolean isMirrored = isMirrored(vector);
        boolean areAllElementsSame = areAllElementsSame(vector);
        int evenCount = countEvenOddElements(vector, true);
        int oddCount = countEvenOddElements(vector, false);

        int[] marks = {1, 2, 3, 4, 5};
        processExamResults(marks);

        System.out.println("Is the vector sorted? " + isSorted);
        System.out.println("Is the vector mirrored? " + isMirrored);
        System.out.println("Are all elements in the vector the same? " + areAllElementsSame);
        System.out.println("Number of even elements in the vector: " + evenCount);
        System.out.println("Number of odd elements in the vector: " + oddCount);
    }
}