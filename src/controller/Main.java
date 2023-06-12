package controller;

import model.Exam;
import model.Vector;

import static logic.ExamLogic.displayExamResults;
import static logic.ExamLogic.processExamResults;
import static logic.VectorLogic.*;

public class Main {
    public static void main(String[] args) {
        int[] arrayVector = {1, 2, 3, 2, 1};
        Vector vector = new Vector(arrayVector);
        boolean isSorted = isSorted(vector.getElementVector());
        boolean isMirrored = isMirrored(vector.getElementVector());
        boolean areAllElementsSame = areAllElementsSame(vector.getElementVector());
        int evenCount = countEvenOddElements(vector.getElementVector(), true);
        int oddCount = countEvenOddElements(vector.getElementVector(), false);

        int[] marks = {1, 2, 3, 4, 5};
        Exam exam = new Exam(marks);
        int[] examResults = processExamResults(exam.getMarks());
        displayExamResults(examResults);

        System.out.println("Is the vector sorted? " + isSorted);
        System.out.println("Is the vector mirrored? " + isMirrored);
        System.out.println("Are all elements in the vector the same? " + areAllElementsSame);
        System.out.println("Number of even elements in the vector: " + evenCount);
        System.out.println("Number of odd elements in the vector: " + oddCount);
    }
}