import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.BufferedReader;


public class Main {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws Exception {


        int n = Integer.parseInt(in.readLine());
        char[] vetor;

        while (n > 0) {

            vetor = in.readLine().toCharArray();

            int[] vetorInt = new int[vetor.length];

            for (int i = 0; i < vetor.length; i++) {
                vetorInt[i] = (int) vetor[i];
            }
            for (int i = 0; i < vetor.length; i++) {
                if ((vetorInt[i] >= 65 && vetorInt[i] <= 90) || (vetorInt[i] >= 97 && vetorInt[i] <= 122)) {
                    vetorInt[i] += 3;
                    vetor[i] = (char) vetorInt[i];
                }
            }
            char[] vetorInvertido = new char[vetor.length];
            int cont = 0;
            for (int i = vetor.length - 1; i >= 0; i--) {
                vetorInvertido[i] = vetor[cont];
                cont++;
            }
            for (int i = 0; i < vetorInvertido.length; i++) {
                vetor[i] = vetorInvertido[i];
            }
            int meio = vetor.length / 2;
            for (int i = meio; i < vetor.length; i++) {
                vetorInt[i] = (int) vetor[i];
                vetorInt[i] -= 1;
                vetor[i] = (char) vetorInt[i];
            }

            String s2 = "";
            for (int i = 0; i < vetor.length; i++) {
                s2 += vetor[i];
            }
            out.print(s2);


            n--;


            out.println();

        }
        out.close();
    }
}
