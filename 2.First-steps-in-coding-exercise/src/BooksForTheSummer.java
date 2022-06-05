import java.util.Scanner;

public class BooksForTheSummer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pages = Integer.parseInt(scanner.nextLine());
        int perhour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int result = (pages / perhour) / days;
        System.out.println(result);
    }
}
