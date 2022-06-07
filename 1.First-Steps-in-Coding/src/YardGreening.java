import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double squares = Double.parseDouble(scanner.nextLine());
        Double price = squares * 7.61;
        Double discount = price * 0.18;
        Double lastprice = price - discount;
        System.out.println("The final price is: " + lastprice + " lv.");
        System.out.println("The discount is: " + discount + " lv.");
    }
}
