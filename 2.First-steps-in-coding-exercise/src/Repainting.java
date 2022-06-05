import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int naylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int paintwater = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        double paintadd = (paint * 14.5) * 0.1;
        double materials = (naylon * 1.5) + (paint * 14.5) + (paintwater * 5);
        double result = materials + paintadd + 3 + 0.4;
        double work = (result * 0.3) * hours;
        double bill = result + work;
        System.out.println(bill);

    }
}
