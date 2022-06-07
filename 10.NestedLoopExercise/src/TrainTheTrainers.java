import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jorry = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int degreeCount = 0;
        double degreeSum = 0;
        boolean flag = false;
        while (!input.equals("Finish")) {

            double currentDegreeSum = 0;
            double averageDegree = 0;
            for (int i = 1; i <= jorry; i++) {
                double degree = Double.parseDouble(scanner.nextLine());
                currentDegreeSum += degree;
                degreeCount++;
                degreeSum += degree;

                if (i == jorry) {
                    averageDegree = currentDegreeSum / i;
                    flag = true;
                    break;
                }

            }
            if (flag) {
                System.out.printf("%s - %.2f.%n", input, averageDegree);
            }
            input = scanner.nextLine();
        }
        if (input.equals("Finish")) {
            System.out.printf("Student's final assessment is %.2f.", degreeSum / degreeCount);
        }
    }
}

