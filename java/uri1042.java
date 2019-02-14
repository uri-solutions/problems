import java.util.Scanner;
import java.io.IOException;

public class Main {

    private static Scanner inp;

    public static void main(String[] args) throws IOException {

        inp = new Scanner(System.in);
        int aux,x, y, z;
        x = inp.nextInt();
        y = inp.nextInt();
        z = inp.nextInt();
        
                
            if (x<y && x<z){
                System.out.print(x);
                System.out.println("");
                if (y<z){
                    System.out.print(y);
                    System.out.println("");
                    System.out.print(z);
                    System.out.println("");
                } else {
                    System.out.print(z);
                    System.out.println("");
                    System.out.print(y);
                    System.out.println("");
                }
                
            }
            if (y<x && y<z){
                System.out.print(y);
                System.out.println("");
                if (x<z){
                    System.out.print(x);
                    System.out.println("");
                    System.out.print(z);
                    System.out.println("");
                } else {
                    System.out.print(z);
                    System.out.println("");
                    System.out.print(x);
                    System.out.println("");
                }
                
            }
            if (z<y && z<x){
                System.out.print(z);
                System.out.println("");
                if (x<y){
                    System.out.print(x);
                    System.out.println("");
                    System.out.print(y);
                    System.out.println("");
                } else {
                    System.out.print(y);
                    System.out.println("");
                    System.out.print(x);
                    System.out.println("");
                    
                }
                
            }
            System.out.println("");
            System.out.println(x);
            System.out.println(y);
            System.out.println(z);
            
            
    }
}


