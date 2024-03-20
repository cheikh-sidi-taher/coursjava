package exercise;

import java.util.Scanner;

public class exo5 {
    public static void main(String[] args) {
      
         Scanner sc = new Scanner(System.in);
        System.out.print("Entrer un entier A:");
        int A = sc.nextInt();

        System.out.print("Entrer un entier B:");
        int B = sc.nextInt();


        System.out.print("Entrer un entier C:");
        int C = sc.nextInt();

       if(A>B && A>C){
        System.out.println(" plus grand de trois entiers saisis  au clavier:" +A);
       }else if (B>A && B>A) {
        System.out.println(" plus grand de trois entiers saisis  au clavier:" +B);
      }else{
        System.out.println(" plus grand de trois entiers saisis  au clavier:" +C);
      }
     
      
    }
       }
      
