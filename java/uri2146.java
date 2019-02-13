import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int c=0 ;
        boolean a;
        while((a=scan.hasNext())){
            c = scan.nextInt();
            System.out.println(c-1);
        }
    }
}
