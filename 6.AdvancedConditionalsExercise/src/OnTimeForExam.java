import java.util.Scanner;

public class OnTimeForExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arriveHour = Integer.parseInt(scanner.nextLine());
        int arriveMinutes = Integer.parseInt(scanner.nextLine());
        int examTime = examHour * 60 + examMinutes;
        int arriveTime = arriveHour * 60 + arriveMinutes;
        String output = "";
        String status = "";
        int diff = Math.abs(examTime - arriveTime);
        int h = diff / 60;
        int m = diff % 60;

        if (arriveTime < examTime - 30) { // Early
            status = "Early";
            if (diff < 60) {
                output = String.format("%d minutes before the start", diff);
            } else {
                output = String.format("%d:%02d hours before the start", h, m);
            }
        } else if (arriveTime <= examTime) { // On Time
            status = "On Time";
            output = String.format("%d minutes before the start", diff);
        } else { // Late
            status = "Late";
            if (diff < 60) {
                output = String.format("%d minutes after the start", diff);
            } else {
                output = String.format("%d:%02d hours after the start", h, m);
            }
        }

        System.out.println(status);
        System.out.println(output);
    }
}
