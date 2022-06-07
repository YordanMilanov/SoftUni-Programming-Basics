import java.util.Scanner;

public class NewEverest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int StartMeters = 5364; // 3484
        int TotalDays = 1;
        int ReachedMeters = 5364;
        int LeftMeters = 3484;
        String input = scanner.nextLine();
        int PerDayMeters = Integer.parseInt(scanner.nextLine());
        boolean Reached = false;

        while (!input.equals("END")) {
            input = scanner.nextLine();
            PerDayMeters = Integer.parseInt(scanner.nextLine());
            if (input.equals("Yes")) {
                TotalDays++;
            }
            if (ReachedMeters > 8848) {
                Reached = true;
                break;
            }
            if (TotalDays > 5) {
                System.out.printf("Failed!\n%d", ReachedMeters);
            }
            ReachedMeters += PerDayMeters;
            LeftMeters -= PerDayMeters;
            }
        if (Reached) {
            System.out.printf("Goal reached for %d days!", TotalDays);
        }
    }
}