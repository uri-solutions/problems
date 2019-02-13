import java.util.Scanner;

/**
 * Created by ygorazambuja on 26/05/17.
 */
public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int cont = 0;
        int t = inp.nextInt();
        int sapo = 0, coelho = 0, rato = 0;
        int sapoN = 0, coelhoN = 0, ratoN = 0;
        double ps = 0, pc = 0, pr = 0;
        while (cont < t) {
            int n = inp.nextInt();
            String k = inp.next();
            if (k.equals("C") || k.equals("c")) {
                coelho++;
                coelhoN += n;
            } else if (k.equals("R") || k.equals("r")) {
                rato++;
                ratoN += n;
            } else if (k.equals("S") || k.equals("s")) {
                sapo++;
                sapoN += n;
            }
            cont++;
        }
        double total = (double) sapoN + (double) coelhoN + (double) ratoN;
        System.out.printf("Total: %.0f cobaias\n", total);
        System.out.println("Total de coelhos: " + coelhoN);
        System.out.println("Total de ratos: " + ratoN);
        System.out.println("Total de sapos: " + sapoN);

        pc = ((100 * coelhoN) / total);
        System.out.printf("Percentual de coelhos: %.2f %%\n", pc);
        pr = ((100 * ratoN) / total);
        System.out.printf("Percentual de ratos: %.2f %%\n", pr);
        ps = ((100 * sapoN) / total);
        System.out.printf("Percentual de sapos: %.2f %%\n", ps);

    }

}
