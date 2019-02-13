
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.BufferedReader;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner inp = new Scanner(System.in);

        int n = inp.nextInt();
        while (n > 0) {
            String s = inp.next();
            char[] ch = s.toCharArray();
            int cont = 0;
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] == '0') {
                    cont += 6;
                }
                if (ch[i] == '1') {
                    cont += 2;
                }
                if (ch[i] == '2') {
                    cont += 5;
                }
                if (ch[i] == '3') {
                    cont += 5;
                }
                if (ch[i] == '4') {
                    cont += 4;
                }
                if (ch[i] == '5') {
                    cont += 5;
                }
                if (ch[i] == '6') {
                    cont += 6;
                }
                if (ch[i] == '7') {
                    cont += 3;
                }
                if (ch[i] == '8') {
                    cont += 7;
                }
                if (ch[i] == '9') {
                    cont += 6;
                }
            }
            System.out.println(cont + " leds");
            n--;

        }
    }
}
