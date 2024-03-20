package exercise;

import java.util.Scanner;

public class exo3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.print("Entrer un entier A:");
        float A = sc.nextInt();
        System.out.print("Entrer un entier B:");
        float B = sc.nextInt();
        float auxilaire = A ;  A = B ;       
            B = auxilaire ;
        System.out.println("le contenu de A est: "+A+"\n");
        System.out.print("le contenu de B est: "+B);
        }
}
