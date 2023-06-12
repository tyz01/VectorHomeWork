package model;

import java.util.Arrays;

public class Exam {
    private int[] marks;

    public Exam(int[] marks) {
        for (int mark : marks) {
            if (mark == 0 || mark > 5) {
                continue;
            }
            this.marks = marks;
        }
    }

    public Exam() {

    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "marks=" + Arrays.toString(marks) +
                '}';
    }
}
