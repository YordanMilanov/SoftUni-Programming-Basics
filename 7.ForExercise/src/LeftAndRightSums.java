import java.util.Scanner;

public class LeftAndRightSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countnumbers = Integer.parseInt(scanner.nextLine());
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 1; i <= countnumbers; i++) {
            int input1 = Integer.parseInt(scanner.nextLine());
            sum1 += input1;
        }
        for (int i = 1; i <= countnumbers; i++) {
            int input2 = Integer.parseInt(scanner.nextLine());
            sum2 += input2;
        }
        if (sum1 == sum2) {
            System.out.println("Yes, sum = " + sum1);
        } else {
            int diff = Math.abs(sum1 - sum2);
            System.out.println("No, diff = " + diff);
        }
    }
}
