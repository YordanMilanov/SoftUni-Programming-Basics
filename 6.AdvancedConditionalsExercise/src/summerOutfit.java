import java.util.Scanner;

public class summerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int degrees = Integer.parseInt(scanner.nextLine());
        String daytime = scanner.nextLine();
        String outfit = "";
        String shoes = "";
        if (degrees >= 10 && degrees <= 18 && daytime.equals("Morning")) {
            outfit = "Sweatshirt";
            shoes = "Sneakers";
        } else if (degrees >= 18 && degrees <= 24 && daytime.equals("Morning")) {
            outfit = "Shirt";
            shoes = "Moccasins";
        } else if (degrees >= 25 && daytime.equals("Morning")) {
            outfit = "T-Shirt";
            shoes = "Sandals";
        } else if (degrees >= 10 && degrees <= 18 && daytime.equals("Afternoon")) {
            outfit = "Shirt";
            shoes = "Moccasins";
        } else if (degrees >= 18 && degrees <= 24 && daytime.equals("Afternoon")) {
            outfit = "T-Shirt";
            shoes = "Sandals";
        } else if (degrees >= 25 && daytime.equals("Afternoon")) {
            outfit = "Swim Suit";
            shoes = "Barefoot";
        } else if (degrees >= 10 && daytime.equals("Evening")) {
            outfit = "Shirt";
            shoes = "Moccasins";
        }
        System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
    }
}
