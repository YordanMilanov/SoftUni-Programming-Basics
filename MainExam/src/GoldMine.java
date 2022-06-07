import java.util.Scanner;

public class GoldMine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double TotalMined = 0;

        for (int i = 0; i < n; i++) {
            double AverageTarget = Double.parseDouble(scanner.nextLine());
            int Days = Integer.parseInt(scanner.nextLine());
            for (int j = 0; j < Days; j++) {
                double mined = Double.parseDouble(scanner.nextLine());
                TotalMined += mined;
            }

            double AverageMined = TotalMined / Days;
            if (AverageMined < AverageTarget) {
                System.out.printf("You need %.2f gold.\n", Math.abs(AverageTarget - AverageMined) );
            } else {
                System.out.printf("Good job! Average gold per day: %.2f.\n", AverageMined);
            }
            TotalMined = 0;
        }
    }
}
