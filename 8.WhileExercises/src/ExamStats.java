import java.util.Scanner;

public class ExamStats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Students = Integer.parseInt(scanner.nextLine());
        double TotalScore = 0;
        double poor = 0;
        double average = 0;
        double good = 0;
        double Top = 0;

        for (int i = 1; i <= Students; i++) {
            double Score = Double.parseDouble(scanner.nextLine());
                TotalScore += Score;
            if (Score <= 2.99) {
                poor++;
            } else if (Score <= 3.99) {
                average++;
            } else if (Score <= 4.99) {
                good++;
            } else {
                Top++;
            }
        }

        double AverageScore = (TotalScore / Students);
        double PoorPercent = (poor / Students) * 100;
        double AveragePercent = (average / Students) * 100;
        double GoodPercent = (good / Students) * 100;
        double TopPercent = (Top / Students) * 100;

        System.out.printf("Top students: %.2f%%\n", TopPercent);
        System.out.printf("Between 4.00 and 4.99: %.2f%%\n", GoodPercent);
        System.out.printf("Between 3.00 and 3.99: %.2f%%\n", AveragePercent);
        System.out.printf("Fail: %.2f%%\n", PoorPercent);
        System.out.printf("Average: %.2f", AverageScore);

        //Ред 1 -	"Top students: {процент студенти с успех 5.00 или повече}%"
        //Ред 2 -	"Between 4.00 and 4.99: {между 4.00 и 4.99 включително}%"
        //Ред 3 -	"Between 3.00 and 3.99: {между 3.00 и 3.99 включително}%"
        //Ред 4 -	"Fail: {по-малко от 3.00}%"
        //Ред 5 -	"Average: {среден успех}"

    }
}
