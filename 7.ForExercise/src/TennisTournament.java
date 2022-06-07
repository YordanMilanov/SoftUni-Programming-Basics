import java.util.Scanner;

public class TennisTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = Integer.parseInt(scanner.nextLine());
        double StartPoints = Double.parseDouble(scanner.nextLine());

        double GainPoints = 0;
        double Winner = 0;
        double Finalist = 0;
        double SemiFinalist = 0;

        for (int i = 1; i <= T; i++) {
            String stage = scanner.nextLine();
            if (stage.equals("W")) {
                GainPoints += 2000;
                Winner++;
            } else if (stage.equals("F")) {
                GainPoints += 1200;
                Finalist++;
            } else if (stage.equals("SF")) {
                GainPoints += 720;
                SemiFinalist++;
            }
        }

        double perWins = (Winner / T) * 100;
        double average = Math.floor(GainPoints / T);
        double finalpoints = GainPoints + StartPoints;

        System.out.printf("Final points: %.0f\nAverage points: %.0f\n%.2f%%",finalpoints ,average, perWins);
    }
}
