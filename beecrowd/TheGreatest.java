package beecrowd;

import java.util.Scanner;

public class TheGreatest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Num1 = scanner.nextInt();
        int Num2 = scanner.nextInt();
        int Num3 = scanner.nextInt();

        String text = "eh o maior";

        if (Num1 > Num2 && Num1 > Num3) {

            System.out.println(Num1 + " " + text);
        } else if (Num2 > Num1 && Num2 > Num3) {

            System.out.println(Num2 + " " + text);
        } else {
            System.out.println(Num3 + " " + text);

        }

    }

}
