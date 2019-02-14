import java.util.Scanner;
import java.io.IOException;

public class Main {

    private static Scanner inp;

    public static void main(String[] args) throws IOException {

        inp = new Scanner(System.in);
        int x[] = new int[6];

        int par = 0, impar = 0, pos = 0, neg = 0;

        for (int i = 1; i <= 5; i++) {
            x[i] = inp.nextInt();

            if ((x[i] % 2) == 0) {
                par++;
            } else {
                impar++;
            }
            if (x[i] > 0) {
                pos++;
            } else {
                neg++;
            }
            if (x[i] == 0){
                neg--;
            }
        }
        System.out.println(par + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(pos + " valor(es) positivo(s)");
        System.out.println(neg + " valor(es) negativo(s)");

    }

}
