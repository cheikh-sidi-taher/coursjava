package beecrowd;

import java.util.Scanner;

public class Average2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double poidsA = 2;
        double poidsB = 3;
        double poidsC = 5;
        float A = scanner.nextFloat();

        float B = scanner.nextFloat();
        float C = scanner.nextFloat();

        double aver = (A * poidsA + B * poidsB + C *  poidsC) / (poidsA + poidsB + poidsC);

        System.out.printf("MEDIA = %.1f%n", aver);
    }
}
