package beecrowd;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Number = scanner.nextInt();

        int numberHeure = scanner.nextInt();

        float salary = scanner.nextFloat();

        float rsult = salary * numberHeure;

        System.out.println("NUMBER  = \n" +Number);
        System.out.printf("SALARY = U$ %.2f\n ", +rsult);

    }

}
