package logic;

public class VectorProgram {

    public static boolean isSorted(int[] vector) {
        for (int i = 0; i < vector.length - 1; i++) {
            if (vector[i] > vector[i + 1]) {
                return false;
            }
        }
        return true;
    }
    public static boolean isMirrored(int[] vector) {
        for (int i = 1; i < vector.length / 2; i++) {
            if (vector[vector.length / 2 - i] != vector[vector.length / 2 + i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean areAllElementsSame(int[] vector) {
        for (int i = 1; i < vector.length - 1; i++) {
            if (vector[0] != vector[i]) {
                return false;
            }
        }
        return true;
    }

    public static int countEvenOddElements(int[] vector, boolean even) {
        int count = 0;
        for (int num : vector) {
            if (even && num % 2 == 0) {
                count++;
            } else if (!even && num % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public static void processExamResults(int[] marks) {
        int totalMarks = marks.length;
        int[] count = new int[6]; // Индекс 0 - количество оценок "ноль", индекс 1 - количество оценок "единица" и т.д.

        for (int mark : marks) {
            count[mark]++;
        }

        System.out.println("Exam Result:");
        for (int i = 5; i >= 0; i--) {
            double percentage = (count[i] * 100.0) / totalMarks;
            System.out.printf("%d%s - %.1f%% (%d)%n", i, (i == 1 ? "s" : ""), percentage, count[i]);
        }
    }
}
