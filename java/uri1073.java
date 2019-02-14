import java.util.Scanner;
import java.io.IOException;

public class Main {

    private static Scanner inp;

    public static void main(String[] args) throws IOException {

        inp = new Scanner(System.in);
        int x = inp.nextInt();
        int cont = 2;
        long resul = 0;
        do {
            resul = (int) Math.pow(cont, 2);
            System.out.println(cont + "^2 = " + resul);
            cont = cont +2;

        } while (cont <= x);

    }
}
