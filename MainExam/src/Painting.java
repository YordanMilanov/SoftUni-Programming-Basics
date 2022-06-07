import java.util.Scanner;

public class Painting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double PaintPrice = 21.50;
        double PaperPrice = 5.20;

        int paint = Integer.parseInt(scanner.nextLine());
        int paper = Integer.parseInt(scanner.nextLine());
        double PriceGloves = Double.parseDouble(scanner.nextLine());
        double PriceBrush = Double.parseDouble(scanner.nextLine());

        double GlovesCount = Math.ceil(paper * 0.35);
        double BrushCount = Math.floor(paint * 0.48);

        double TotalBill = (PaintPrice * paint + PaperPrice * paper + PriceGloves * GlovesCount + PriceBrush * BrushCount);
        double delivery = TotalBill / 15;
        System.out.printf("This delivery will cost %.2f lv.",delivery);
    }
}
