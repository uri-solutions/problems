import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        boolean cond = false;
        while (!cond) {
            int n1 = inp.nextInt();
            int n2 = inp.nextInt();
            int soma = 0;
            if (n1 <= 0 || n2 <= 0) {
                System.out.print("");
                cond = true;
                break;

            }

            if (n1 > n2) {
                for (int i = n2; i <= n1; i++) {
                    System.out.print(i + " ");
                    soma += i;
                }
            } else {
                for (int i = n1; i <= n2; i++) {
                    System.out.print(i + " ");
                    soma += i;
                }
            }
            System.out.println("Sum=" + soma);
        }
    }
}
