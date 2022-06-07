import java.util.Scanner;

public class ComputerRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double MarchMayDay = 10.50;
        double MarchMayNight = 8.40;
        double JuneAugustDay = 12.60;
        double JuneAugustNight = 10.20;

        //•	На първия ред - месецът - текст с възможности: "march", "april", "may", "june", "july", "august"
        //•	На втория ред - броят на прекараните часове - цяло число в диапазона [1...10]
        //•	На третия ред - броят на хората в групата -  цяло число в диапазона [1...10]
        //•	На четвъртия ред - времето от деня – текст с възможности: "day" или "night"

        String Month = scanner.nextLine();
        int Hours = Integer.parseInt(scanner.nextLine());
        int People = Integer.parseInt(scanner.nextLine());
        String Time = scanner.nextLine();

        double PerHour = 0;

        if (Month.equals("march") || Month.equals("april") || Month.equals("may")) {
            if (Time.equals("day")) {
                PerHour = 10.50;
            } else if (Time.equals("night")) {
                PerHour = 8.40;
            }
        } else if (Month.equals("june") || Month.equals("july") || Month.equals("august")) {
            if (Time.equals("day")) {
                PerHour = 12.60;
            } else if (Time.equals("night")) {
                PerHour = 10.20;
            }
        }

        if (People >= 4) {
            PerHour -= PerHour * 0.1;
        }
        if (Hours >= 5) {
            PerHour -= PerHour * 0.5;
        }
        double Total = PerHour * People * Hours;
        double PricePerPersonForHour = Total / People / Hours;

        System.out.printf("Price per person for one hour: %.2f\n" +
                "Total cost of the visit: %.2f",PricePerPersonForHour, Total);
    }
}
