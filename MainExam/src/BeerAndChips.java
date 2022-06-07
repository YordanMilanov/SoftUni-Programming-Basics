import java.util.Scanner;

public class BeerAndChips {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	На първия ред - името на футболният фен – текст
        //•	На втория ред - предвиденият бюджет  – реално число в диапазона [1.0… 100 000.0]
        //•	На третия ред - брой бутилки бира – цяло число в диапазона [1… 100 000]
        //•	На четвърти ред - брой пакети чипс – цяло число в диапазона [1… 100 000]

        String name = scanner.nextLine();
        double budget = Double.parseDouble(scanner.nextLine());
        int beer = Integer.parseInt(scanner.nextLine());
        int chips = Integer.parseInt(scanner.nextLine());

        double BeerBill = 1.20 * beer;
        double ChipsPrice = BeerBill * 0.45;
        double ChipsBill = Math.ceil(chips * ChipsPrice);
        double Total = BeerBill + ChipsBill;
        double needed =Total - budget;

        if (budget >= Total) {
            System.out.printf("%s bought a snack and has %.2f leva left.",name,Math.abs(needed));
        } else {
            System.out.printf("%s needs %.2f more leva!", name, needed);

        }
    }
}
