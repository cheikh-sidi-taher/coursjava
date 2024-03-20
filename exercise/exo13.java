package exercise;

import java.util.Scanner;

public class exo13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("entrer votre number");
        int mois;
         mois = scanner.nextInt();
       
        switch (mois) {
            case 1:
                System.out.println("janvier");
                break;
            case 2:
                System.out.println("février");
                break;
            case 3:
                System.out.println("mars");
                break;
            case 4:
                System.out.println("avril");
                break;
            case 5:
                System.out.println("mai");
                break;
            case 6:
                System.out.println("juin");
                break;
            case 7:
                System.out.println("juillet");
                break;


                case 8:
                System.out.println("aout");
                break;
                case 9:
                System.out.println("september");
                break;
                case 10:
                System.out.println("october");
                break;

                case 11:
                System.out.println("november");
                break;


                case 12:
                System.out.println("decembre");
                break;
                

        }

    }
}