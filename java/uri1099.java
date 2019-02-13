import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int k = inp.nextInt();

        while (k > 0) {
            int n1 = inp.nextInt();
            int n2 = inp.nextInt();
            int soma = 0;

            if (n1 > n2) {
                for (int i = n2+1; i < n1; i++) {
                    if (i % 2 != 0) {
                        soma += i;
                    }
                }
            } else {
                for (int i = n1+1; i < n2; i++) {
                    if (i % 2 != 0) {
                        soma += i;
                    }
                }
            }

            System.out.println(soma);
            k--;
        }
    }
}
