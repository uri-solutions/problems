import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su solución ejecutar
 */
public class uri1002 {

    public static void main(String[] args) throws IOException {

        Scanner inp = new Scanner(System.in);

        double r, a;

        r = inp.nextDouble();

        a = (r * r) * 3.14159;

        System.out.printf("A=%.4f", a);
        System.out.println();
        
        

    }

}
