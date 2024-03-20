package exercise;

public class exo1 {
   // 
    public static void main(String[] args) {
        float A, B, C;


        for (int i = 0; i < 2; i++) {
           
            A = scanner.nextFloat();

            
            B = scanner.nextFloat();

           
            C = scanner.nextFloat();


            float aireTriangleRectangle = (A * C) * 1 / 2;
            double aireCercle = Math.PI * C * C;
            float aireTrapeze = (A + B) * C * 1 / 2;
    
            float aireCree = B * B;
    
            float aireRectangele = A * B;
            System.out.printf("TRIANGULO: %.3f\n", aireTriangleRectangle);
            System.out.printf("CIRCULO:: %.3f\n", aireCercle);
            System.out.printf("TRAPEZIO: %.3f\n", aireTrapeze);
            System.out.printf("QUADRADO: %.3f\n", aireCree);
            System.out.printf("RETANGULO: %.3f\n", aireRectangele);
    
        }

            // Utilise les valeurs A, B et C selon tes besoins ici
        }

    }
    
}
