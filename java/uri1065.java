import java.util.Scanner;
import java.io.IOException;

public class Main {

    private static Scanner inp;

    public static void main(String[] args) throws IOException {

        inp = new Scanner(System.in);
        int i = 0;
        int n1 = inp.nextInt();
        if (n1 % 2 == 0) {

            i++;
        }
        int n2 = inp.nextInt();
        if (n2 % 2 == 0) {

            i++;
        }
        int n3 = inp.nextInt();
        if (n3 % 2 ==0){
            i++;
        }
        
        int n4 = inp.nextInt();
        if (n4%2 ==0){
            i++;
        }
        int n5 = inp.nextInt();
        if (n5%2 ==0){
            i++;
        }
        
        System.out.println(i+" valores pares");

    }

}
