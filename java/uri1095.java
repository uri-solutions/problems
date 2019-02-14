import java.util.Scanner;
import java.io.IOException;

public class Main {

    private static Scanner inp;

    public static void main(String[] args) throws IOException {

        inp = new Scanner(System.in);

            int i=1, j=60;
            
            while (j>=0){
                System.out.println("I="+i+" J="+j);
                i=i+3;
                j=j-5;
                
            }
    }
}
