import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int a = 3;
        int b = Integer.parseInt(scanner.nextLine());
        int projects = a * b;
        System.out.println("The architect "+ name + " will need " + projects + " hours to complete " + b + " project/s.");

    }
}
