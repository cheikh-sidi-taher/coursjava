package exercise;

import java.util.Scanner;

public class exo7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrer M:");
        int m = sc.nextInt();

        System.out.print("Entrer N:");
        int n = sc.nextInt();

        int result = m * n;

        if (result == 0) {
            System.out.println(" le produit de ces deux nombres est null :" + result);
        } else if (result < 0) {
            System.out.println(" le produit de ces deux nombres est negatif:" + result);

        }

        else {
            System.out.println("le produit de ces deux nombres est positif " + result);
        }

    }

}
