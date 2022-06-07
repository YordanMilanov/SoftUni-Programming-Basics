import java.util.Scanner;

public class Travel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        while (!input.equals("End")) {

            double Price = Double.parseDouble(scanner.nextLine());
            double savings = 0;

            while (Price > savings) {
                double money = Double.parseDouble(scanner.nextLine());
                savings += money;
            }
            System.out.printf("Going to %s!\n", input);

            input = scanner.nextLine();
        }
    }
}
