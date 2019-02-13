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

        int A, B,C,D, DIFERENCA;
        

        A = inp.nextInt();
        B = inp.nextInt();
        C = inp.nextInt();
        D = inp.nextInt();

        DIFERENCA = (A*B - C*D);

        System.out.printf("DIFERENCA = %d",DIFERENCA);
        System.out.println("");

    }

}
