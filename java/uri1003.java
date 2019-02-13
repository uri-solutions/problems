import java.io.IOException;
import java.util.Scanner;

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
