
import java.util.Scanner;

/**
 * Created by ygorazambuja on 11/04/17.
 */
public class Main {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        boolean condFim2 = false;
        boolean condFim = false;

        int cont = 0;
        int total = 0;

        while (!condFim) {
            while (!condFim2) {
                String s = inp.nextLine();
                char[] vet = s.toCharArray();
                boolean condFor = false;
                if (s.equals("caw caw")) {
                    condFor = false;
                    condFim2 = true;
                } else {
                    condFor = true;
                }
                if (condFor) {
                    for (int j = 0; j < vet.length; ) {
                        if (vet[j] == '*') {
                            total += 4;
                            j += 1;
                        } else {
                            j++;
                        }
                        if (vet[j] == '*') {
                            total += 2;
                            j++;
                        } else {
                            total += 0;
                            j++;
                        }
                        if (vet[j] == '*') {
                            total += 1;
                            j++;
                        } else {
                            j++;
                        }
                    }
                }
            }
            condFim2 = false;
            System.out.println(total);
            total = 0;
            cont++;
            if(cont == 3){
                condFim = true;
            }
        }
    }
}

