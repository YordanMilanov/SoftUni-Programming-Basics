import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int stop = Integer.parseInt(scanner.nextLine());
        int target = Integer.parseInt(scanner.nextLine());
        int combinationNumber = 0;
        boolean isFound = false;

        for (int i = start; i <= stop; i++) {
            for (int j = start; j <= stop; j++) {
                combinationNumber++;
                if (i + j == target) {
                    System.out.printf("Combination N:%d (%d + %d = %d)\n", combinationNumber, i, j, target);
                    isFound = true;
                    break;
                }
            }
            if (isFound == true) {
                break;
            }
        }

        if (isFound == false) {
            System.out.printf("%d combinations - neither equals %d", combinationNumber, target);
        }
    }
}
