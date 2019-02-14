import java.util.Scanner;
import java.io.IOException;

public class Main {

    private static Scanner inp;

    public static void main(String[] args) throws IOException {

        inp = new Scanner(System.in);
        double x = inp.nextDouble();
        double newx = 01;
        double total;
        if (x > 0 && x <= 400){
            newx = (x*15)/100;
            total = newx+x;
            
            System.out.printf("Novo salario: %.2f\n",total);
            System.out.printf("Reajuste ganho: %.2f\n",newx);
            System.out.println("Em percentual: 15 %");
        }
        if (x > 400 && x <= 800){
            newx = (x*12)/100;
            total = newx+x;
            System.out.printf("Novo salario: %.2f\n",total);
            System.out.printf("Reajuste ganho: %.2f\n",newx);
            System.out.println("Em percentual: 12 %");
        }
        if (x > 800 && x <= 1200){
            newx = (x*10)/100;
            total = newx+x;
            System.out.printf("Novo salario: %.2f\n",total);
            System.out.printf("Reajuste ganho: %.2f\n",newx);
            System.out.println("Em percentual: 10 %");
        }
        if (x > 1200 && x <= 2000){
            newx = (x*7)/100;
            total = newx+x;
            System.out.printf("Novo salario: %.2f\n",total);
            System.out.printf("Reajuste ganho: %.2f\n",newx);
            System.out.println("Em percentual: 7 %");
        }
        if (x > 2000){
            newx = (x*4)/100;
            total = newx+x;
            System.out.printf("Novo salario: %.2f\n",total);
            System.out.printf("Reajuste ganho: %.2f\n",newx);
            System.out.println("Em percentual: 4 %");
        }
        
        
        
    }

}
