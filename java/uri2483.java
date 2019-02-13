import java.util.Scanner;

/**
 * Created by ygorazambuja on 28/06/17.
 */
public class Main {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int n = inp.nextInt();
        String s = "Feliz nat";

        for (int i = 0; i < n ; i++) {
            s += "a";
        }
        s += "l!";
        System.out.println(s);


    }

}
