import java.util.Scanner;

public class Resturant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chicken = Integer.parseInt(scanner.nextLine());
        int fish = Integer.parseInt(scanner.nextLine());
        int vegitables = Integer.parseInt(scanner.nextLine());
        double bill = (chicken * 10.35) + (fish * 12.4) + (vegitables * 8.15);
        double desert = bill * 0.2;
        double total = bill + desert + 2.5;
        System.out.println(total);
    }
}
