import java.util.Scanner;

public class fishingShip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //  Бюджет на групата – цяло число в интервала [1…8000]
        // Сезон – текст : &quot;Spring&quot;, &quot;Summer&quot;, &quot;Autumn&quot;, &quot;Winter&quot;
        // Брой рибари – цяло число в интервала [4…18]
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());
        int spring = 3000;
        int summer = 4200;
        int autumn = 4200;
        int winter = 2600;
        double discount = 0;
        double bill = 0;
        if (people <= 6) {
            discount = 0.1;
        } else if (people <= 11) {
            discount = 0.15;
        } else {
            discount = 0.25;
        }

        if (season.equals("Spring")) {
            bill = spring - (spring * discount);
        } else if (season.equals("Summer") || season.equals("Autumn")) {
            bill = summer - (summer * discount);
        } else if (season.equals("Winter")) {
            bill = winter - (winter * discount);
        }

        if (people % 2 == 0 && season.equals("Winter")) {
            bill -= bill * 0.05;
        } else if (people % 2 == 0 && season.equals("Spring")) {
            bill -= bill * 0.05;
        } else if (people % 2 == 0 && season.equals("Summer")) {
            bill -= bill * 0.05;
        }

        if (budget >= bill) {
            double left = budget - bill;
            System.out.printf("Yes! You have %.2f leva left.", left);
        } else {
            double needed = bill - budget;
            System.out.printf("Not enough money! You need %.2f leva.", needed);
        }
    }
}
