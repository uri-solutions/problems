import java.util.Scanner;
import java.io.IOException;

public class Main {

    private static Scanner inp;

    public static void main(String[] args) throws IOException {

        inp = new Scanner(System.in);
        int x = inp.nextInt();
        int newx = 0;
        for (int i = 1; i<=x;i++){
            newx = i*i;
            System.out.println(i+" "+newx +" "+(i*i*i));
            System.out.println(i+" "+(newx+1) +" "+((i*i*i)+1));
            
            
        }
        
        
        
    }

}
