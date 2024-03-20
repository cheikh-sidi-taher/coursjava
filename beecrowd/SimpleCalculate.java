package beecrowd;

import java.util.Scanner;

public class SimpleCalculate {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        // Read data for product 1
        int code1 = scanner.nextInt();
        int units1 = scanner.nextInt();
        double price1 = scanner.nextDouble();
        
        // Read data for product 2
        int code2 = scanner.nextInt();
        int units2 = scanner.nextInt();
        double price2 = scanner.nextDouble();
        
        // Calculate total amount to be paid
        double totalAmount = (units1 * price1) + (units2 * price2);
        
        // Output the result
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", totalAmount);
        
        scanner.close();
    }
    
    
    
    
}
