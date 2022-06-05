import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double deposit = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double interestrate = Double.parseDouble(scanner.nextLine());
        double interestpermonth = deposit * (interestrate / 100) / 12;
        double result = deposit + (interestpermonth * months);
        System.out.println(result);
    }
}
