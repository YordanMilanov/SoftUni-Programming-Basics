import java.util.Scanner;

public class smallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double count = Double.parseDouble(scanner.nextLine());
        double coffee = 0;
        double water = 0;
        double beer = 0;
        double sweets = 0;
        double peanuts = 0;
        if (city.equals("Varna")) {
                coffee = 0.45;
                water = 0.7;
                beer = 1.1;
                sweets = 1.35;
                peanuts = 1.55;
        } else if (city.equals("Plovdiv")) {
            coffee = 0.4;
            water = 0.7;
            beer = 1.15;
            sweets = 1.3;
            peanuts = 1.5;
        } else if (city.equals("Sofia")) {
                coffee = 0.5;
                water = 0.8;
                beer = 1.2;
                sweets = 1.45;
                peanuts = 1.6;
        }
        if (product.equals("coffee")) {
                System.out.println(coffee * count);
            } else if (product.equals("water")) {
                System.out.println(water * count);
            } else if (product.equals("beer")) {
                System.out.println(beer * count);
            } else if (product.equals("sweets")) {
                System.out.println(sweets * count);
            } else if (product.equals("peanuts")) {
                System.out.println(peanuts * count);
            }

        }
    }
