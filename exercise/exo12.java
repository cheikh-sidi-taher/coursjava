package exercise;

import java.util.Scanner;

public class exo12 {
    
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.println("entrer votre age stp");
       int age = scanner.nextInt();

       if(age > 6 && age <= 7){
        System.out.println("poussin");
       }else if(age > 8 && age <= 9 ){
        System.out.println("pupille");
       }else if(age > 10 && age <= 11 ){
        System.out.println("minime");
       }else if(age > 12){
        System.out.println("cadet");
       }else{
        System.out.println("votre age n existe pas");
       }
       }
}
