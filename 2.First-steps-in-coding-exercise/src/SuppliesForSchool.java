import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pen = Integer.parseInt(scanner.nextLine());
        int marker = Integer.parseInt(scanner.nextLine());
        int soap = Integer.parseInt(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine());
        double bill = (pen * 5.80) + (marker * 7.20) + (soap * 1.20);
        double discountcalculated = discount / 100;
        double result = bill - (bill * discountcalculated);
        System.out.println(result);
    }
}
