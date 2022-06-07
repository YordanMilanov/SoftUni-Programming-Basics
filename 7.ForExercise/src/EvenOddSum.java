import java.util.Scanner;

public class EvenOddSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int oddSum = 0;
        int evenSum = 0;

        for (int i = 1; i <= n ; i++) {
            int input = Integer.parseInt(scanner.nextLine());

            if (i % 2 == 0) {
                evenSum += input;
            } else {
                oddSum += input;
            }
        }
            if (evenSum == oddSum) {
                System.out.println("Yes");
                System.out.println("Sum = " + Math.abs(oddSum));
            } else {
                System.out.println("No");
                System.out.println("Diff = " + Math.abs(oddSum - evenSum));
            }
        }
    }
