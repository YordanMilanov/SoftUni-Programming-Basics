import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Вид цветя - текст с възможности - &quot;Roses&quot;, &quot;Dahlias&quot;, &quot;Tulips&quot;, &quot;Narcissus&quot;, &quot;Gladiolus&quot;
        // Брой цветя - цяло число в интервала [10…1000]
        // Бюджет - цяло число в интервала [50…2500]
        String flowers = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());
        double discount = 0.0;
        double price = 0.0;
        if (flowers.equals("Roses")) {
            price = 5;
            double bill = count * price;
            if (count > 80) {
                discount = bill * 0.1;
                double tax = bill - discount;
                if (budget >= tax) {
                    double left = budget - tax;
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", count, flowers, left);
                } else {
                    double needed = tax - budget;
                    System.out.printf("Not enough money, you need %.2f leva more.", needed);
                }
            } else {
                double tax = bill;
                if (budget >= tax) {
                    double left = budget - tax;
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", count, flowers, left);
                } else {
                    double needed = tax - budget;
                    System.out.printf("Not enough money, you need %.2f leva more.", needed);
                }
            }
        } else if (flowers.equals("Dahlias")) {
            price = 3.8;
            double bill = count * price;
            if (count > 90) {
                discount = bill * 0.15;
                double tax = bill - discount;
                if (budget >= tax) {
                    double left = budget - tax;
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", count, flowers, left);
                } else {
                    double needed = tax - budget;
                    System.out.printf("Not enough money, you need %.2f leva more.", needed);
                }
            } else {
                double tax = bill;
                if (budget >= tax) {
                    double left = budget - tax;
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", count, flowers, left);
                } else {
                    double needed = tax - budget;
                    System.out.printf("Not enough money, you need %.2f leva more.", needed);
                }
            }
        } else if (flowers.equals("Tulips")) {
            price = 2.8;
            double bill = count * price;
            if (count > 80) {
                discount = bill * 0.15;
                double tax = bill - discount;
                if (budget >= tax) {
                    double left = budget - tax;
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", count, flowers, left);
                } else {
                    double needed = tax - budget;
                    System.out.printf("Not enough money, you need %.2f leva more.", needed);
                }
            } else {
                double tax = bill;
                if (budget >= tax) {
                    double left = budget - tax;
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", count, flowers, left);
                } else {
                    double needed = tax - budget;
                    System.out.printf("Not enough money, you need %.2f leva more.", needed);
                }
            }
        } else if (flowers.equals("Narcissus")) {
            price = 3;
            double bill = count * price;
            if (count < 120) {
                discount = bill * 0.15;
                double tax = bill + discount;
                if (budget >= tax) {
                    double left = budget - tax;
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", count, flowers, left);
                } else {
                    double needed = tax - budget;
                    System.out.printf("Not enough money, you need %.2f leva more.", needed);
                }
            } else {
                double tax = bill;
                if (budget >= tax) {
                    double left = budget - tax;
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", count, flowers, left);
                } else {
                    double needed = tax - budget;
                    System.out.printf("Not enough money, you need %.2f leva more.", needed);
                }
            }
        } else if (flowers.equals("Gladiolus")) {
            price = 2.5;
            double bill = count * price;
            if (count < 80) {
                discount = bill * 0.2;
                double tax = bill + discount;
                if (budget >= tax) {
                    double left = budget - tax;
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", count, flowers, left);
                } else {
                    double needed = tax - budget;
                    System.out.printf("Not enough money, you need %.2f leva more.", needed);
                }
            } else {
                double tax = bill;
                if (budget >= tax) {
                    double left = budget - tax;
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", count, flowers, left);
                } else {
                    double needed = tax - budget;
                    System.out.printf("Not enough money, you need %.2f leva more.", needed);
                }
            }
        } else {
            System.out.println();
        }
    }
}
