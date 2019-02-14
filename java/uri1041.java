import java.util.Scanner;
import java.io.IOException;

public class Main {

    private static Scanner inp;

    public static void main(String[] args) throws IOException {

        inp = new Scanner(System.in);
        double x = inp.nextDouble();
        double y = inp.nextDouble();
        int nada = 0;
        do {

            if (x == 0 && y == 0) {
                System.out.println("Origem");
            }
            if (x == 0.0 && y != 0.0) {

                System.out.println("Eixo Y");
                nada++;
                break;

            }
            if (y == 0.0 && x != 0.0) {

                System.out.println("Eixo X");
                nada++;
                break;
            }
            if (x > 0 && x != 0) {
                if (y > 0 && y != 0) {
                    System.out.println("Q1");
                } else {
                    System.out.println("Q4");
                }
            }
            if (x < 0 && x != 0) {
                if (y > 0 && y != 0) {
                    System.out.println("Q2");
                } else {
                    System.out.println("Q3");
                }

            }
        } while (nada == 1);
    }

}
