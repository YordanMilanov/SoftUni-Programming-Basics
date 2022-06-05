import java.util.Scanner;

public class RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double radian = Double.parseDouble(scanner.nextLine());
        Double degrees = radian * 180 / Math.PI;
        System.out.println(degrees);
    }
}
