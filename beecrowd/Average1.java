package beecrowd;

import java.util.Scanner;

public class Average1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double poidsA = 3.5;
        double poidsB = 7.5;
        float A = scanner.nextFloat();

        float B = scanner.nextFloat();

        double aver = (A * poidsA + B * poidsB) / (poidsA + poidsB);

        System.out.printf("MEDIA = %.5f%n", aver);
    }
}
