import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        double part = Double.parseDouble(scanner.nextLine());
        double cube = (a * b * c) * 0.001;
        double partpercent = cube * (part / 100);
        double result = cube - partpercent;
        System.out.println(result);
    }
}
