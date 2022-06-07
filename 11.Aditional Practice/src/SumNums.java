import java.util.Scanner;

public class SumNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while (sum < number) {
            int add = Integer.parseInt(scanner.nextLine());
            sum += add;
        }

        System.out.println(sum);
    }
}
