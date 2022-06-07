import java.util.Scanner;

public class OldLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String searchedBook = scanner.nextLine();
        String currentBook = scanner.nextLine();
        int books = 0;
        boolean isFound = false;
        while (!currentBook.equals("No More Books")) {

            if (currentBook.equals(searchedBook)) {
                isFound = true;
                break;
            }
            books++;
            currentBook = scanner.nextLine();
        }

        if (isFound) {
            System.out.printf("You checked %d books and found it.", books);
        } else {
            System.out.printf("The book you search is not here!\nYou checked %d books.", books);
        }
    }
}
