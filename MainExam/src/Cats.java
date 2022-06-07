import java.util.Scanner;

public class Cats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int SmallCats = 0;
        int MediumCats = 0;
        int BigCats = 0;

        double TotalFood = 0;

        for (int i = 1; i <= number; i++) {
            int food = Integer.parseInt(scanner.nextLine());
                TotalFood += food;
            if (food < 200) {
                SmallCats++;
            } else if (food < 300) {
                MediumCats++;
            } else {
                BigCats++;
            }
        }

        double TotalFoodKg = TotalFood / 1000;
        double Price = TotalFoodKg * 12.45;

        System.out.printf("Group 1: %d cats.\n" +
                "Group 2: %d cats.\n" +
                "Group 3: %d cats.\n" +
                "Price for food per day: %.2f lv.\n",SmallCats, MediumCats, BigCats, Price);
    }
}
