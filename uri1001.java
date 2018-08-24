import java.util.Scanner;
import java.io.IOException;

public class uri1001 {

    public static void main(String[] args) throws IOException {

        Scanner inp = new Scanner(System.in);

        int a, b, x;

        a = inp.nextInt();
        b = inp.nextInt();

        x = a + b;

        System.out.println("X = " + x);

    }
}