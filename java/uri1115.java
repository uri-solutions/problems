import java.util.Scanner;

/**
 * Created by ygorazambuja on 27/05/17.
 */
public class Main {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int x = 1;
        int y = 1;
        boolean cond = false;
        while (!cond) {
            x = inp.nextInt();
            y = inp.nextInt();

            if (x == 0 | y == 0) {
                cond = false;
                break;
            }
            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            }
            if (x < 0 && y < 0) {
                System.out.println("terceiro");
            }
            if (y > 0 && x < 0) {
                System.out.println("segundo");
            }
            if (y < 0 && x > 0) {
                System.out.println("quarto");
            }

        }
    }

}
