import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = Integer.parseInt(scanner.nextLine());
        int Y = Integer.parseInt(scanner.nextLine());
        int CakeSize = X * Y;
        String input = scanner.nextLine();
        boolean isFinished = false;
        while (!input.equals("STOP")) {
            int pieces = Integer.parseInt(input);
             CakeSize -= pieces;
            if (CakeSize <= 0) {
                isFinished = true;
                break;
            }
            input = scanner.nextLine();
        }
        if (isFinished) {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(CakeSize));
        } else {
            System.out.printf("%d pieces are left.", CakeSize);
        }


    }
}
