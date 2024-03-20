package exercise;

import java.util.Scanner;

public class exo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrer votre note :");
        int note = sc.nextInt();

        if(note > 10 & note <= 20){
        System.out.println("note et valide "+note);
        }else{
            System.out.println("note et non valide ");
        }
        
   
       }
}
