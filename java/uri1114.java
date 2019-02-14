import java.util.Scanner;
import java.io.IOException;

public class Main {

    private static Scanner inp;

    public static void main(String[] args) throws IOException {

        inp = new Scanner(System.in);
        int cont = 0;
        int senha = 2002;
        
        while (cont != 1) {
           int senha2 = inp.nextInt();
           if (senha == senha2){
               System.out.println("Acesso Permitido");
               cont++;
               break;
            
        } else {
               System.out.println("Senha Invalida");
           }
        }

    }
}
