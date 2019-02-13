import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int n = inp.nextInt();

        while (n > 0) {
            double n1 = inp.nextDouble();
            double n2 = inp.nextDouble();
            double n3 = inp.nextDouble();

            n1 = n1 * 0.2;
            n2 = n2 * 0.3;
            n3 = n3 * 0.5;

            double resul = n1 + n2 + n3;

            System.out.printf("%.1f\n", resul);

            n--;
        }
    }
}
