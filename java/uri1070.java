import java.util.Scanner;
import java.io.IOException;

public class Main {

    private static Scanner inp;

    public static void main(String[] args) throws IOException {

        inp = new Scanner(System.in);
        int x = inp.nextInt();
        int cont = 1;
        if (x%2 ==0){
            x++;
        } 
        if (x%2 !=0){
            System.out.println(x);
        }
        
        while (cont <= 5) {
            x = x+2;
            System.out.println(x);
            cont++;
        } 
        

    }

}
