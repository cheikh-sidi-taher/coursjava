package exercise;

import java.util.Scanner;

public class exo15 {

  

   

    public static void main(String[] args) {

        int i=1 , S=0; 
        while ( i <= 10  ) {
            //  S = S+i;
             S +=i;
             i++ ; 
        }
     System.out.print("la somme de 1 -> 10 est: " +S);
     }
}