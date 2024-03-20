package exercise;

import java.util.Scanner;

public class exo2 {
    public static void main(String[] args) {
        

        Scanner in = new Scanner(System.in);

        System.out.println("enter 1 number");

        float num1, num2;

        num1 = in.nextFloat();

        System.out.println("enter 2 number");

        num2 = in.nextFloat();

        float produi = num1 * num2;

        System.out.println("leur produi: " + produi);

    }
}
