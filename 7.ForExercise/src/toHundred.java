import java.util.Scanner;

public class toHundred {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int two = 2;
        for (int i = 0; i <= n; i += 2) {
            double result = Math.pow(two, i);
            System.out.printf("%.0f %n", result);
        }
    }
}
