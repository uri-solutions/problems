
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;


public class Main {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws Exception {

        int n = Integer.parseInt(in.readLine());
        char[] vetor;
        while (n > 0) {

            vetor = in.readLine().toCharArray();

            int num = Integer.parseInt(in.readLine());

            int[] vetorNum = new int[vetor.length];
            String s = "";

            for (int i = 0; i < vetor.length; i++) {
                vetorNum[i] = (int) vetor[i];
                vetorNum[i] -= num;
                if (vetorNum[i] <= 64) {
                    vetorNum[i] += 26;
                }
            }
            for (int i = 0; i < vetor.length; i++) {
                vetor[i] = (char) vetorNum[i];
                s += vetor[i];
            }
            out.println(s);
            n--;
        }
        out.close();
    }
}
