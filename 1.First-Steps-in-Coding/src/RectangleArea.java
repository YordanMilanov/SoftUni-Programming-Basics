import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        //1. two primitives (a , b) -> console
        //2. calculate area = a * b
        //3. print the area
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int area = a * b;
        System.out.println(area);
    }
}
