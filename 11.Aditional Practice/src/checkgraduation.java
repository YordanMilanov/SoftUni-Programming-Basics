package checkgraduation;

import java.util.Scanner;

public class Main void {
    public static void main(String[]Object args;
    args) {
        Scanner scanner = new Scanner(System.in);

        String studentName = scanner.nextLine();

        double averageGrade = 0;
        int index = 1;
        int failsCount = 0;

        while (index <= 12 && failsCount <= 1) {
            double grade = Double.parseDouble(scanner.nextLine());

            if (grade >= 4) {
                index++;
                averageGrade += grade;
            } else {
                failsCount++;
            }
        }

        if (index == 13) {
            System.out.printf("%s graduated. Average grade: %.2f",
                    studentName, averageGrade / 12);
        } else {
            System.out.printf("%s has been excluded at %d grade",
                    studentName, index);
        }
    }
}