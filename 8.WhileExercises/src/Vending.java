import java.util.Scanner;

public class Vending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int coins = 0;
        double change = Double.parseDouble(scanner.nextLine());
        change = Math.round(change * 100);
        while (change > 0) {
            if (change >= 200) {
                coins++;
                change -= 200;
            } else if (change >= 100) {
                coins++;
                change -= 100;
            } else if (change >= 50) {
                coins++;
                change -= 50;
            } else if (change >= 20) {
                coins++;
                change -= 20;
            } else if (change >= 10) {
                coins++;
                change -= 10;
            } else if (change >= 5) {
                coins++;
                change -= 5;
            } else if (change >= 2) {
                coins++;
                change -= 2;
            } else {
                coins++;
                change--;
            }
        }
        System.out.println(coins);
    }
}