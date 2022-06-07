import java.util.Scanner;

public class Steps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int goal = 10000;
        int TotalSteps = 0;

        while (TotalSteps < goal) {
            String input = scanner.nextLine();

            if (input.equals("Going home")) {
                TotalSteps += Integer.parseInt(scanner.nextLine());
                break;
            }
            TotalSteps += Integer.parseInt(input);
        }
        if (TotalSteps >= goal) {
            System.out.printf("Goal reached! Good job!\n%d steps over the goal!", TotalSteps - goal);
        } else {
            System.out.printf("%d more steps to reach goal.", goal - TotalSteps);
        }
    }
}
