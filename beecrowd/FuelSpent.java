package beecrowd;

import java.util.Scanner;

public class FuelSpent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int temps = scanner.nextInt();
        int vitess = scanner.nextInt();

        double distance = temps * vitess;

        double litre = distance / 12;

        System.out.printf("%.3f\n", litre);
    }
}