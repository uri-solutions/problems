import java.util.Scanner;
import java.io.IOException;

public class Main {

    private static Scanner inp;

    public static void main(String[] args) throws IOException {

        inp = new Scanner(System.in);
        int x = inp.nextInt();
        
        for (int i = 1;i <= 10; i++){
            
            System.out.println(i+" x "+x+" = "+(i*x));
        }
        
        
    }

}
