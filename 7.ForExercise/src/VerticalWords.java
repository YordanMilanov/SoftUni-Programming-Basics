import java.util.Scanner;

public class VerticalWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char symbol = input.charAt(0);
        for (int position = 0; position <= input.length() - 1; position++) {
            symbol = input.charAt(position);
            System.out.println(symbol);
        }
    }
}
