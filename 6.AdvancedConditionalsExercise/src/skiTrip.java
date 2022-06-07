import java.util.Scanner;

public class skiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String rate = scanner.nextLine();
        int nights = days - 1;
        double price = 0.00;
        double discount = 0.00;
        double rateadd = 0.00;
        if (type.equals("room for one person")) {
            price = 18.00;
        } else if (type.equals("apartment")) {
            price = 25.00;
            if (days < 10) {
                discount = 0.30;
            } else if (days <=15) {
                discount = 0.35;
            } else {
                discount = 0.50;
            }
        } else if (type.equals("president apartment")) {
            price = 35.00;
            if (days < 10) {
                discount = 0.10;
            } else if (days <=15) {
                discount = 0.15;
            } else {
                discount = 0.20;
            }
        }
        double bill = price * nights;
        double cut = discount * bill;
        double bill2 = bill - cut;
        if (rate.equals("positive")) {
            bill2 += 0.25 * bill2;
        } else if (rate.equals("negative")) {
            bill2 -= 0.1 * bill2;
        }
        System.out.printf("%.2f", bill2);
    }
}
