package beecrowd;

import java.util.Scanner;

public class Difference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();

        int DEF = A * B - C * D;

        System.out.println("DIFERENCA = " + DEF);

    }
}
