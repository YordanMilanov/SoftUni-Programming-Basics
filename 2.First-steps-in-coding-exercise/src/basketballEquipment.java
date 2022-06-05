import java.util.Scanner;

public class basketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tax = Integer.parseInt(scanner.nextLine());
        double shoes = tax * 0.6;
        double equip = shoes * 0.8;
        double ball = equip * 0.25;
        double acces = ball * 0.2;
        double result = tax + shoes + equip + ball + acces;
        System.out.println(result);

    }
}
