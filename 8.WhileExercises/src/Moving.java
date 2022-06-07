import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int depth = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int space = width * depth * height;
        int boxes = 0;

        boolean full = false;
        String input = scanner.nextLine();

        while (!input.equals("Done")) {
            boxes = Integer.parseInt(input);
            space -= boxes;

            if (space < 0) {
                full = true;
                break;
            }
            input = scanner.nextLine();
        }
        if (full) {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(space));
        } else if(!full) {
            System.out.printf("%d Cubic meters left.", Math.abs(space));
        }
    }
}

