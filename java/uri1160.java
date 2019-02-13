import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int n = inp.nextInt();

        int pA = 0, pB = 0;

        double porcA, porcB;

        int cont = 0;
        for (int i = 1; i <= n; i++) {
            cont =0;

            pA = inp.nextInt();
            pB = inp.nextInt();

            porcA = inp.nextDouble();
            porcB = inp.nextDouble();

            porcA /= 100;
            porcB /= 100;

            do {

                pA += pA * porcA;
                pB += pB * porcB;

                cont++;
                if(cont > 100){
                    break;
                }

            } while (pA <= pB);
            if (cont == 100) {
                System.out.println("100 anos.");
            }
            if (cont > 100) {
                System.out.println("Mais de 1 seculo.");
            }
            if (cont < 100) {
                System.out.printf("%d anos.\n", cont);
            }

        }


    }

}
