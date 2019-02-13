import java.util.Scanner;
import java.io.IOException;

public class Main {

    private static Scanner inp;

	public static void main(String[]args) throws IOException {
        
        inp = new Scanner(System.in);

        int A = inp.nextInt();
        int B = inp.nextInt();
        int C = inp.nextInt();
        int D = inp.nextInt();
        int n1,n2;
        n1 = C+D;
        n2 = A+B;
        if (n1>n2 && A>0 & B>0 && C>0 &&D>0 && B>C && D>A){
        	
        	if ((A%2)==0) {
        		System.out.println("Valores aceitos");
        		
        	}
        	
        }
        else{
        	System.out.println("Valores nao aceitos");	
        }
        

       }
    }
    


