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

        double A, B, MEDIA;
        

        A = inp.nextDouble();
        B = inp.nextDouble();

        MEDIA = ((A*3.5)+(B*7.5)) /11;

        System.out.printf("MEDIA = %.5f",MEDIA);
        System.out.println("");

    }

}
