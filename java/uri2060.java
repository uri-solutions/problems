import java.util.Scanner;
import java.io.IOException;

public class Main {

    private static Scanner inp;

    public static void main(String[] args) throws IOException {

        inp = new Scanner(System.in);
        int n = inp.nextInt();
        int x[] = new int[n+1];
        
        
        int m2 = 0, m3 = 0, m4 = 0, m5 = 0;

        for (int i = 1; i <= n; i++) {
            
            x[i] = inp.nextInt();
            
            if ( x[i]%2 ==0){
                m2++;
            }
            if ( x[i]%3 ==0){
                m3++;
            }
            if ( x[i]%4 ==0){
                m4++;
            }
            if ( x[i]%5 ==0){
                m5++;
            }
            
        }
            System.out.println(m2+" Multiplo(s) de 2");
            System.out.println(m3+" Multiplo(s) de 3");
            System.out.println(m4+" Multiplo(s) de 4");
            System.out.println(m5+" Multiplo(s) de 5");
            
            

    }

}
