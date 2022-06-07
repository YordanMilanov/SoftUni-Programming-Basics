import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = Integer.parseInt(scanner.nextLine());
        double washmaschine = Double.parseDouble(scanner.nextLine());
        double PricePerToy = Double.parseDouble(scanner.nextLine());
        double SavedMoney = 0;
        int toys = 0;
        for (int i = 1; i <= year; i++) {
            if (i % 2 == 0) {
                SavedMoney += (i * 5) - 1;
            } else {
                toys++;
            }
        }
        double total = toys * PricePerToy + SavedMoney;

        if (total >= washmaschine) {
            double left = Math.abs(total - washmaschine);
            System.out.printf("Yes! %.2f", left);
        } else {
            double needed = Math.abs(washmaschine - total);
            System.out.printf("No! %.2f", needed);
        }
    }
}
