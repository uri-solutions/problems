import java.util.Scanner;
import java.io.IOException;

public class Main {

    private static Scanner inp;

    public static void main(String[] args) throws IOException {

        inp = new Scanner(System.in);
        int x = inp.nextInt();
        int aux = 0, cont = 1;
        do {
            System.out.println(cont);
            cont = cont + 2;
            
           
            

        } while (cont <= x);

    }
}
