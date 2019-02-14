import java.util.Scanner;
import java.io.IOException;

public class Main {

    private static Scanner inp;

    public static void main(String[] args) throws IOException {

        inp = new Scanner(System.in);

        int x[] = new int[11];
        int i;
        for  (i=1;i<=10;i++){
               x[i] = inp.nextInt();
               
               if (x[i] <=0) {
                   x[i] = 1;
                   System.out.println("X["+(i-1)+"] = "+x[i]);
                   
               } else {
                   System.out.println("X["+(i-1)+"] = "+x[i]);
               }
               
               
               
               
               
               
            
        }

        
        
        
           }
}
