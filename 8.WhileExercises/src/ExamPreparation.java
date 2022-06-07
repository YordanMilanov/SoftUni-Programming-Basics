import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int LimitBad = Integer.parseInt(scanner.nextLine());
        String Problem = scanner.nextLine();
        int counterBad = 0;
        double gradesSum = 0;
        int gradesCount = 0;
        String LastProblem = "";
        boolean isFailed = false;
        while (!Problem.equals("Enough")) {
            double score = Double.parseDouble(scanner.nextLine());
            gradesSum += score;
            gradesCount++;
            LastProblem = Problem;
            if(score <= 4) {
                counterBad++;
                if (counterBad == LimitBad) {
                    isFailed = true;
                    break;
                }
            }
            Problem = scanner.nextLine();
        }
        double averageScore = gradesSum / gradesCount;
        if (isFailed) {
        System.out.printf("You need a break, %d poor grades.", counterBad);
        } else {
        System.out.printf("Average score: %.2f\nNumber of problems: %d\nLast problem: %s",averageScore, gradesCount, LastProblem);
        }
    }
}
