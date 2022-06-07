import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double PaperPrice = 5.80;
        double ClothPrice = 7.20;
        double StickPrice = 1.20;

        int Paper = Integer.parseInt(scanner.nextLine());
        int Cloth = Integer.parseInt(scanner.nextLine());
        double Stick = Double.parseDouble(scanner.nextLine());
        double DiscountPercent = Double.parseDouble(scanner.nextLine());

        double TotalPrice = (PaperPrice * Paper) + (ClothPrice * Cloth) + (StickPrice * Stick);
        double FinalPrice = TotalPrice - (TotalPrice / 100 * DiscountPercent);
        System.out.printf("%.3f",FinalPrice);
    }
}
