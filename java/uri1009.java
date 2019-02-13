import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {

        Scanner inp = new Scanner(System.in);

        String A;
        double B, C;

        A = inp.nextLine(); 
        B = inp.nextDouble(); 
        C = inp.nextDouble(); 

        System.out.printf("TOTAL = R$ %.2f", ((C * 15) / 100) + B);
        System.out.println("");

    }

}
