package exercise;

import java.util.Scanner;

public class exo9 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Entrer un entier A:");
        int A = sc.nextInt();

        System.out.print("Entrer un entier B:");
        int B = sc.nextInt();


        System.out.print("Entrer un entier C:");
        int C = sc.nextInt();


        int somme = A+B+C;

        if(somme > 0){
        System.out.println("la moyenne de trois entiers saisis par l'utilisateur : = "  + (somme/3) );
        }else{
            System.out.println("stp entrer vos nombre  " );
        }
    
}}
