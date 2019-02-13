import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        Integer par[] = new Integer[5];
        Integer impar[] = new Integer[5];
        int imp = 0;
        int pa = 0;
        int n;
        for (int i = 0; i < 15; i++) {
            n = inp.nextInt();
            if (n % 2 == 0) {
                if (pa < 5) {
                    par[pa] = n;
                    pa++;
                } else {
                    for (int j = 0; j < par.length; j++) {
                        System.out.println("par[" + j + "] = " + par[j]);
                    }
                    par[0] = n;
                    pa = 1;
                    for (int j = 1; j < par.length; j++) {
                        par[j] = null;
                    }
                }
            } else {
                if (imp < 5) {
                    impar[imp] = n;
                    imp++;
                } else {
                    for (int j = 0; j < par.length; j++) {
                        System.out.println("impar[" + j + "] = " + impar[j]);
                    }
                    impar[0] = n;
                    imp = 1;
                    for (int j = 1; j < par.length; j++) {
                        impar[j] = null;
                    }
                }
            }

        }
        for (int i = 0; i < impar.length; i++) {
            if (impar[i] != null) {
                System.out.println("impar[" + i + "] = " + impar[i]);
            }
        }
        for (int i = 0; i < impar.length; i++) {
            if (par[i] != null) {
                System.out.println("par[" + i + "] = " + par[i]);
            }
        }
    }
}
