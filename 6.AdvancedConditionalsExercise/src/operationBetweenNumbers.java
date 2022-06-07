import java.util.Scanner;

public class operationBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double N1 = Double.parseDouble(scanner.nextLine());
        double N2 = Double.parseDouble(scanner.nextLine());
        String symbol = scanner.nextLine();
        double plus = N1 + N2;
        double minus = N1 - N2;
        double multi = N1 * N2;
        double div = N1 / N2;
        double modul = N1 % N2;
        if (symbol.equals("+")) {
            System.out.printf("%.0f %s %.0f = %.0f", N1, symbol, N2, plus);
            if (plus % 2 == 0) {
                System.out.print(" - even");
            } else {
                System.out.print(" - odd");
            }
        } else if (symbol.equals("-")) {
            System.out.printf("%.0f %s %.0f = %.0f", N1, symbol, N2, minus);
            if (minus % 2 == 0) {
                System.out.print(" - even");
            } else {
                System.out.print(" - odd");
            }
        }
        if (symbol.equals("*")) {
            System.out.printf("%.0f %s %.0f = %.0f", N1, symbol, N2, multi);
            if (multi % 2 == 0) {
                System.out.print(" - even");
            } else {
                System.out.print(" - odd");
            }
        } else if (symbol.equals("/")) {
            if (N2 == 0) {
                System.out.printf("Cannot divide %.0f by zero", N1);
            } else {
                System.out.printf("%.0f %s %.0f = %.2f", N1, symbol, N2, div);
            }
        } else if (symbol.equals("%")) {
            if (N2 == 0) {
                System.out.printf("Cannot divide %.0f by zero", N1);
            } else {
                System.out.printf("%.0f %s %.0f = %.0f", N1, symbol, N2, modul);
            }
        }
    }
}
