import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su solución ejecutar
 */
public class Main {

    public static void main(String[] args) throws IOException {

        Scanner inp = new Scanner(System.in);

        int A,B;
        double C;
        
        A = inp.nextInt();
        B = inp.nextInt(); //HORAS
        C = inp.nextDouble(); //QTD P HRS
        
          
        
        
        System.out.printf("NUMBER = %d", A);
        System.out.println();
        System.out.printf("SALARY = U$ %.2f",B*C );
        System.out.println();

    }

}
