package beecrowd;

import java.util.Scanner;

import variable.variable;

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float A = scanner.nextFloat();

        float B = scanner.nextFloat();

        float C = scanner.nextFloat();

        float aireTriangleRectangle = (A * C) * 1 / 2;
        double aireCercle = Math.PI * C * C;
        float aireTrapeze = (A + B) * C * 1 / 2;

        float aireCree = B * B;

        float aireRectangele = A * B;
        System.out.printf("TRIANGULO: %.3f\n", aireTriangleRectangle);
        System.out.printf("CIRCULO:: %.3f\n", aireCercle);
        System.out.printf("TRAPEZIO: %.3f\n", aireTrapeze);
        System.out.printf("QUADRADO: %.3f\n", aireCree);
        System.out.printf("RETANGULO: %.3f\n", aireRectangele);

    }
}
