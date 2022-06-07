import java.util.Scanner;

public class hotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        double days = Double.parseDouble(scanner.nextLine());
        double prices = 0.0;
        double pricea = 0.0;
        if (month.equals("May") || month.equals("october")) {
            prices = 50 * days;
            pricea = 65 * days;
            if (days >= 7 && days <= 14) {
                prices = 50 * days * 0.95;
            } else if (days > 14) {
                prices = 50 * days * 0.7;
                pricea = 65 * days * 0.9;
            }
        } else if (month.equals("June") || month.equals("September")) {
            prices = 75.2 * days;
            pricea = 68.7 * days;
            if (days > 14) {
                prices = 75.2 * days * 0.8;
                pricea = 68.7 * days * 0.9;
            }
        } else if (month.equals("July") || month.equals("August")) {
            prices = 76 * days;
            pricea = 77 * days;
            if (days > 14) {
                pricea = 77 * days * 0.9;
            }
        }
        System.out.printf("Apartment: %.2f lv. %n", pricea);
        System.out.printf("Studio: %.2f lv.", prices);
    }
}
