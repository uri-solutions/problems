import java.util.Scanner;
import java.io.IOException;

public class Main {

    private static Scanner inp;

    public static void main(String[] args) throws IOException {

        inp = new Scanner(System.in);
        //int n1,n2,n3,n4,n5,n6;
       double n[] = new double [6];
       int cont = 0;
            for(int x = 0; x<6;x++){
                
                n[x] = inp.nextDouble();
                if (n[x]>0){
                    cont++;
                }
                
               
            }
        System.out.printf("%d valores positivos\n",cont);
        
     
        
          
      
            
            
    }
}


