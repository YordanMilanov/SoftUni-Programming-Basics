import java.util.Scanner;

public class Zoomarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogcount = Integer.parseInt(scanner.nextLine());
        int catcount = Integer.parseInt(scanner.nextLine());
        double dog = 2.50;
        int cat = 4;
        double dogbill = dogcount * dog;
        int catbill = catcount * cat;
        double bill = dogbill + catbill;
        System.out.println(+bill+ " lv.");
    }
}
