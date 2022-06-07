import java.util.Scanner;

public class fruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double count = Double.parseDouble(scanner.nextLine());
        double price = 0;
        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                if (fruit.equals("banana")) {
                    price = 2.5;
                } else if (fruit.equals("apple")) {
                    price = 1.2;
                } else if (fruit.equals("orange")) {
                    price = 0.85;
                } else if (fruit.equals("grapefruit")) {
                    price = 1.45;
                } else if (fruit.equals("kiwi")) {
                    price = 2.7;
                } else if (fruit.equals("pineapple")) {
                    price = 5.5;
                } else if (fruit.equals("grapes")) {
                    price = 3.85;
                }
                double bill = price * count;
                System.out.printf("%.2f", bill);
                break;
            default:
                System.out.println("error");
                break;
        }
        switch (day){
            case "Saturday":
            case "Sunday":
                if (fruit.equals("banana")) {
                    price = 2.7;
                } else if (fruit.equals("apple")) {
                    price = 1.25;
                } else if (fruit.equals("orange")) {
                    price = 0.9;
                } else if (fruit.equals("grapefruit")) {
                    price = 1.6;
                } else if (fruit.equals("kiwi")) {
                    price = 3;
                } else if (fruit.equals("pineapple")) {
                    price = 5.6;
                } else if (fruit.equals("grapes")) {
                    price = 4.2;
                }
                double bill1 = price * count;
                System.out.printf("%.2f", bill1);
                break;
            default:
                System.out.printf("error");
                break;
        }
    }
}
