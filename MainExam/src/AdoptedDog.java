import java.util.Scanner;

public class AdoptedDog {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Закупеното количество храна за кученцето в килограми – цяло число в интервала [1 …100]
        //•	На всеки следващ ред до получаване на команда Adopted ще
        // получавате колко грама изяжда кученцето на всяко хранене - цяло число в интервала [10 …1000]

        int Food = Integer.parseInt(scanner.nextLine()) * 1000;
        String input = scanner.nextLine();
        double eaten = 0;
        boolean isFinished = false;

        while (!input.equals("Adopted")) {
            double eat = Double.parseDouble(input);

            eaten += eat;

            if(eaten > Food) {
                isFinished = true;
            }
            input = scanner.nextLine();
        }
        double LeftNeeded = Math.abs(Food - eaten);
        if (isFinished) {
            System.out.printf("Food is not enough. You need %.0f grams more.", LeftNeeded);
        } else {
            System.out.printf("Food is enough! Leftovers: %.0f grams.", LeftNeeded);
        }
    }
}
