package exercise;

import java.util.Scanner;

public class exo4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Entrer un entier A:");
        int A = sc.nextInt();

        if (A % 2 == 0) {
            System.out.print("nombre et pair:");
        }else{
            System.out.print("nombre et impair:");
        }

    }

}
