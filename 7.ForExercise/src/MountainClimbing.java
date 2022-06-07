import java.util.Scanner;

public class MountainClimbing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groups = Integer.parseInt(scanner.nextLine());

        double totalpeople = 0;
        double musala = 0;
        double monblan = 0;
        double kiliman = 0;
        double k2 = 0;
        double everest = 0;

        for (int i = 1; i <= groups; i++) {
            int people = Integer.parseInt(scanner.nextLine());
            totalpeople += people;
            if (people <= 5) {
                musala += people;
            } else if (people <= 12) {
                monblan += people;
            } else if (people <= 25) {
                kiliman += people;
            } else if (people <= 40) {
                k2 += people;
            } else {
                everest += people;
            }
        }

        double perMusala = musala / totalpeople * 100;
        double perMonblan = monblan / totalpeople * 100;
        double perKiliman = kiliman / totalpeople * 100;
        double perK2 = k2 / totalpeople * 100;
        double perEverest = everest / totalpeople * 100;
        System.out.printf("%.2f%%\n%.2f%%\n%.2f%%\n%.2f%%\n%.2f%%\n",perMusala, perMonblan, perKiliman, perK2, perEverest);
    }
}