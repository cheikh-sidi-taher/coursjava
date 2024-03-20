package beecrowd;

import java.util.Scanner;

public class SalarywithBonus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        double salary = scanner.nextDouble();

        double total = scanner.nextDouble();

        double pourcentage = (total * 15) / 100 + salary;

        System.out.printf("TOTAL = R$ %.2f\n ", +pourcentage);

    }

}
