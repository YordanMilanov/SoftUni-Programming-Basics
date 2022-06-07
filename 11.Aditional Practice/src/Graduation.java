import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int grades = 1;
        double average = 0;
        int fail = 0;

        while (grades < 12) {
            grades++;
            double currentGrade = Double.parseDouble(scanner.nextLine());
            if (currentGrade >= 4) {
                average += currentGrade;

            } else {
                average += currentGrade;
                fail++;
            }
            if (fail >= 2) {
                System.out.printf("%s has been excluded in %d grade", name, grades -2);
                break;
            }
            if (grades == 12) {
                double total = average / grades;
                System.out.printf("%s graduated. Average grade: %.2f", name, total);
            }
        }
    }
}
