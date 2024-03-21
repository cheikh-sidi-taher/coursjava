package beecrowd;

import java.util.Scanner;

public class Consumption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();
        float Y = scanner.nextFloat();
        float consom = X / Y;

        String text = "km/l"; 

        String formattedResult = String.format("%.3f", consom);

        System.out.println(formattedResult + " " + text);

    }
}
