package variable;

/**
 * variable
 */

import java.util.Scanner;

public class variable {

     public static void main(String[] args) {

          Scanner in = new Scanner(System.in);

          System.out.println("enter for : * / % + - ");

          char c = in.next().charAt(0);

          int n1, n2;
          System.out.println("enter 1 number");

          n1 = in.nextInt();

          System.out.println("enter 2 number");

          n2 = in.nextInt();

          switch (c) {
               case '*':
                    System.out.println("res =:" + (n1 * n2));
                    break;

               case '/':
                    System.out.println("res =:" + (n1 / n2));
                    break;

               case '%':
                    System.out.println("res =:" + (n1 % n2));
                    break;

               case '+':
                    System.out.println("res =:" + (n1 + n2));
                    break;
               case '-':
                    System.out.println("res =:" + (n1 - n2));
                    break;

               default:

               System.out.println("not opertor");
                    break;
          }

     }

}