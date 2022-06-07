import java.util.Scanner;

public class HotelRoom2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        double nights = Double.parseDouble(scanner.nextLine());
        double price = 0.0;

        if (month.equals("May") || month.equals("October")){
            if (nights > 7 && nights <= 14){
                System.out.printf("Apartment: %.2f lv.%nStudio: %.2f lv.",nights * 65, nights * 47.5);
            }else if (nights <= 7){
                System.out.printf("Apartment: %.2f lv.%nStudio: %.2f lv.",nights * 65, nights * 50);
            }else {
                System.out.printf("Apartment: %.2f lv.%nStudio: %.2f lv.",nights * 58.5, nights * 35);
            }
        }else if (month.equals("June") || month.equals("September")){
            if (nights <= 14){
                System.out.printf("Apartment: %.2f lv.%nStudio: %.2f lv.",nights * 68.70, nights * 75.20);
            }else {
                System.out.printf("Apartment: %.2f lv.%nStudio: %.2f lv.",nights * 61.83, nights * 60.16);
            }
        }else if (month.equals("July") || month.equals("August")) {
            if (nights <= 14) {
                System.out.printf("Apartment: %.2f lv.%nStudio: %.2f lv.", nights * 77, nights * 76);
            } else {
                System.out.printf("Apartment: %.2f lv.%nStudio: %.2f lv.", nights * 69.30, nights * 76);
            }
        }
    }
}

