import java.sql.SQLOutput;
import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double TripPrice = Double.parseDouble(scanner.nextLine());
        double CurrentSaves = Double.parseDouble(scanner.nextLine());
        int TotalDays = 0;
        int SaveDay = 0;
        int SpendDay = 0;
        while (TripPrice > CurrentSaves && SpendDay < 5) {
            String status = scanner.nextLine();
            double SpendSave = Double.parseDouble(scanner.nextLine());
            TotalDays++;
            if (status.equals("save")) {
                SaveDay++;
                CurrentSaves += SpendSave;
                if (CurrentSaves >= TripPrice) {
                    System.out.printf("You saved the money for %d days.", TotalDays);
                }
                SpendDay = 0;
            } else if (status.equals("spend")) {
                SpendDay++;
                CurrentSaves -= SpendSave;
                if (CurrentSaves < 0) {
                    CurrentSaves = 0;
                }
            }
            if (SpendDay == 5) {
                System.out.printf(("You can't save the money.\n%d"), TotalDays);
            }
        }
    }
}
