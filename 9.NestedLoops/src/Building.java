import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int FloorCount = Integer.parseInt(scanner.nextLine());
        int apartments = Integer.parseInt(scanner.nextLine());

        for (int floor = FloorCount; floor >= 1; floor--) {
            for (int roomNumber = 0; roomNumber <= apartments - 1; roomNumber++) {
                if (floor == FloorCount) {
                    System.out.printf("L%d%d ", floor, roomNumber);
                } else if (floor % 2 == 0) {
                    System.out.printf("O%d%d ", floor, roomNumber);
                } else {
                    System.out.printf("A%d%d ", floor, roomNumber);
                }
            }
            System.out.println();
        }
    }
}
