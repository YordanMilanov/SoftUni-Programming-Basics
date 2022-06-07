import java.util.Scanner;

public class MinMaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countnumbers = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= countnumbers; i++) {
            int value = Integer.parseInt(scanner.nextLine());
            if (value < min) {
            min = value;
            }
            if (value > max) {
                max = value;
            }
        }
        System.out.println("Max number: " + max);
        System.out.println("Min number: " + min);
    }
}
