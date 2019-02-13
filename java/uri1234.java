import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String l;
        int count;
        while ((l = read()) != null) {
            String[] letters = l.split("");
            count = 0;
            for (String letter : letters) {
                if (letter.matches("\\w")) {
                    letter = count++ % 2 == 0 ? letter.toUpperCase() : letter.toLowerCase();
                }
                out.print(letter);
            }
            out.println();
        }
        out.close();
    }

    private static String read() throws IOException {
        return in.readLine();
    }
}