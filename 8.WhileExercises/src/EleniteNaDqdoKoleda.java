import java.util.Scanner;

public class EleniteNaDqdoKoleda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int DaysMissing = Integer.parseInt(scanner.nextLine());
        int Food = Integer.parseInt(scanner.nextLine());
        double FirstDeer = Double.parseDouble(scanner.nextLine());
        double SecondDeer = Double.parseDouble(scanner.nextLine());
        double ThirdDeer = Double.parseDouble(scanner.nextLine());

        double TotalFood = (FirstDeer + SecondDeer + ThirdDeer) * DaysMissing;

        if (TotalFood <= Food) {
            System.out.printf("%.0f kilos of food left.", Math.floor(Food - TotalFood));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(TotalFood - Food));
        }
    }
}
