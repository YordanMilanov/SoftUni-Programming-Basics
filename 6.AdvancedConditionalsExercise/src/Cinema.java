import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int row = Integer.parseInt(scanner.nextLine());
        int column = Integer.parseInt(scanner.nextLine());
        double income = 0.0;
        if (name.equals("Premiere")) {
            income = 12;
        } else if (name.equals("Normal")) {
            income = 7.5;
        } else if (name.equals("Discount")) {
            income = 5;
        }
        double win = row * column * income;
        System.out.printf("%.2f leva", win);
    }
}
