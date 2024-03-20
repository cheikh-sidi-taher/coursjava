package exercise;

import java.util.Scanner;

public class exo16 {



    public static void main(String[] args) {
       
        int n;

        int s =0;
        Scanner in = new Scanner(System.in);
      
        System.out.println("entre N");

         n= in.nextInt();

         while (n <=10) {
            // s = s+n
            s+=n;
            n++;
            
         }

         System.out.println(s);
       }
    
}
