package beecrowd;

import java.util.Scanner;

public class AreaofCircle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double R = scanner.nextDouble();
        double A = 3.14159 * R * R;
        System.out.printf("A=%.4f\n", A);
    }

}
