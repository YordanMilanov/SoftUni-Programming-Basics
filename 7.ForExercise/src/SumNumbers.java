import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countNumbers = Integer.parseInt(scanner.nextLine());
        double sum = 0;
        for (int position = 1; position<=countNumbers; position++) {
           double value = Double.parseDouble(scanner.nextLine());
            sum += value;
        }
        System.out.printf("%.0f", sum);
    }
}
