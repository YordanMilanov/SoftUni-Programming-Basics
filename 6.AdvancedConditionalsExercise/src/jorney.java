import java.util.Scanner;

public class jorney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double percent = 0;
        String where ="";
        String location ="";
        if (budget <= 100 && season.equals("summer")) {
            percent = 0.3;
            where = "Camp";
            location = "Bulgaria";
        } else if (budget <= 100 && season.equals("winter")) {
            percent = 0.7;
            where = "Hotel";
            location = "Bulgaria";
        } else if (budget <= 1000 && season.equals("summer")) {
            percent = 0.4;
            where = "Camp";
            location = "Balkans";
        } else if (budget <= 1000 && season.equals("winter")) {
            percent = 0.8;
            where = "Hotel";
            location = "Balkans";
        } else if (budget > 1000 && season.equals("summer")) {
            percent = 0.9;
            where = "Hotel";
            location = "Europe";
        } else if (budget > 1000 && season.equals("winter")) {
            percent = 0.9;
            where = "Hotel";
            location = "Europe";
        }
        double bill = budget * percent;
        System.out.println("Somewhere in " + location);
        System.out.printf("%s - %.2f", where, bill);
    }
}
