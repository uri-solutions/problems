import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su solución ejecutar
 */
public class uri1003 {

    public static void main(String[] args) throws IOException {
        Scanner inp = new Scanner(System.in);
        int A, B, SOMA;
        A = inp.nextInt();
        B = inp.nextInt();
        SOMA = A + B;
        System.out.printf("SOMA = %d", SOMA);
        System.out.println();
    }

}
