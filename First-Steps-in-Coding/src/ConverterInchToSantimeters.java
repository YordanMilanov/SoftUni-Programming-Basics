import java.util.Scanner;

public class ConverterInchToSantimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double inches = Double.parseDouble(scanner.nextLine());
        Double cm = inches * 2.54;
        System.out.println(cm);
    }
}
