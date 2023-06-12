package logic;

public class ExamLogic {
    public static int[] processExamResults(int [] examMarks) {
        int[] count = new int[6];

        for (int mark : examMarks) {
            count[mark]++;
        }

        return count;
    }

    public static void displayExamResults(int[] examResults) {
        System.out.println("Exam Result:");
        for (int i = 5; i >= 1; i--) {
            double percentage = (examResults[i] * 100.0) / examResults.length;
            System.out.printf("%d - %.1f%% (%d)%n", i, percentage, examResults[i]);
        }
    }
}
