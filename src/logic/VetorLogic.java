package logic;

public class VetorLogic {

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

    public static int[] processExamResults(int[] marks) {
        int totalMarks = marks.length;
        int[] count = new int[6];

        for (int mark : marks) {
            count[mark]++;
        }

        int[] result = new int[6];
        for (int i = 0; i < 6; i++) {
            result[i] = count[i];
        }

        return result;
    }
}
