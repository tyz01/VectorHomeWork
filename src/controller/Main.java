package controller;

import static logic.VetorLogic.*;

public class Main {
    public static void main(String[] args) {
        int[] vector = {1, 2, 3, 2, 1};

        boolean isSorted = isSorted(vector);
        boolean isMirrored = isMirrored(vector);
        boolean areAllElementsSame = areAllElementsSame(vector);
        int evenCount = countEvenOddElements(vector, true);
        int oddCount = countEvenOddElements(vector, false);

        int[] marks = {1, 2, 3, 4, 5, 5, 4, 3, 2, 1};
        int[] examResults = processExamResults(marks);

        System.out.println("Exam Result:");
        for (int i = 5; i >= 0; i--) {
            double percentage = (examResults[i] * 100.0) / marks.length;
            System.out.printf("%d%s - %.1f%% (%d)%n", i, (i == 1 ? "s" : ""), percentage, examResults[i]);
        }
        System.out.println("Is the vector sorted? " + isSorted);
        System.out.println("Is the vector mirrored? " + isMirrored);
        System.out.println("Are all elements in the vector the same? " + areAllElementsSame);
        System.out.println("Number of even elements in the vector: " + evenCount);
        System.out.println("Number of odd elements in the vector: " + oddCount);
    }
}