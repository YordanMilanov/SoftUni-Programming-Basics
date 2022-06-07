import java.util.Scanner;

public class Everest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int StartMeters = 5364; // 3484
        int TotalDays = 1;
        int ReachedMeters = 5364;
        int LeftMeters = 3484;
        int PerDayMeters = 0;
        while (LeftMeters > 0 && TotalDays <= 5) {
            String YESorNO = scanner.nextLine();
            if (YESorNO.equals("Yes")) {
                TotalDays++;
            }
            if (YESorNO.equals("END") && LeftMeters > 0) {
                System.out.printf("Failed!\n%d", ReachedMeters);
                return;
            } else if (YESorNO.equals("END") && LeftMeters <= 0) {
                System.out.printf("Goal reached for\n%d days!", TotalDays);
                return;
            }
            PerDayMeters = Integer.parseInt(scanner.nextLine());
            LeftMeters -= PerDayMeters;
            ReachedMeters += PerDayMeters;
            if (LeftMeters <= 0) {
                System.out.printf("Goal reached for %d days!", TotalDays);
                return;
            }
        }
        if (LeftMeters > 0 || TotalDays == 5) {
            int RM1 = ReachedMeters - PerDayMeters;
            System.out.printf("Failed!\n%d", RM1);
        }
    }
}

