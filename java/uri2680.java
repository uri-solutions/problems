import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n;
        int m, sum;

        n = s.nextInt();

        for (int j = 0; j < n; j++) {
            sum = 0;
            m = s.nextInt();
            for (int i = 1; i <= Math.sqrt(m); i++) {
                if (m != 0) {
                    if (m % i == 0) {
                        sum += i;
                        if (m / i != i) {
                            sum += m / i;
                        }
                    }
                }
            }
            System.out.println(sum);
        }
    }
}