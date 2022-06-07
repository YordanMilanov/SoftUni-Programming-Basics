import java.util.Scanner;

public class Deposit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double totalsum = 0;

        while(!input.equals("NoMoreMoney")) {

            double money = Double.parseDouble(input);

            if (money < 0) {
                System.out.println("Invalid Operation!");
                break;
            }
            System.out.printf("Increase: %.2f%n",money);
            totalsum += money;
            input = scanner.nextLine();
        }

        System.out.printf("Total: %.2f", totalsum);
    }
}
