import java.util.Scanner;

public class USDtoBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double dollar = Double.parseDouble(scanner.nextLine());
        Double BGN = 1.79549;
        Double converted = dollar * BGN;
        System.out.println(converted);
    }
}
