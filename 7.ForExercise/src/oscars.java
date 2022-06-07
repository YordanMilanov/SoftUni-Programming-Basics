import java.util.Scanner;

public class oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String joureeName = scanner.nextLine();
            double joureePoints = Double.parseDouble(scanner.nextLine());
            academyPoints += joureeName.length() * joureePoints / 2;
            if (academyPoints >= 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", name, academyPoints);
                return;
            }
        }
        if (academyPoints < 1250.5) {
            System.out.printf("Sorry, %s you need %.1f more!", name, 1250.5 - academyPoints);
        }
    }
}

