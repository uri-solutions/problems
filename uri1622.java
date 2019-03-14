import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, q;
        while ((n = s.nextInt()) != 0 && (q = s.nextInt()) != 0) {

            boolean lamp[] = new boolean[n];

            String linha = s.next();

            for (int i = 0; i < n; i++) {
                lamp[i] = linha.charAt(i) == 'o';
            }

            for (int i = 0; i < q; i++) {
                boolean[] v = new boolean[n];

                System.arraycopy(lamp, 0, v, 0, n);

                int k = s.nextInt();
                int m = s.nextInt();
                int currLp = 0, rep = 0, teste = 0;
                boolean go = true;

                while (go) {
                    teste += k;
                    if (teste >= n) {
                        teste = teste - n;
                    }
                    if (teste == 0) {
                        go = false;
                    }
                    rep++;
                }

                int vezes = m / rep, loop = m % rep;

                if (vezes % 2 != 0) {
                    loop += rep;
                }

                for (int j = 0; j < loop; j++) {
                    v[currLp] = !v[currLp];
                    currLp += k;
                    if (currLp >= n) {
                        currLp = currLp - n;
                    }
                }

                String out = "";
                for (boolean b : v) {
                    if (b) {
                        out += "o";
                    } else {
                        out += "x";
                    }
                }

                System.out.println(out);
            }
        }
    }
}