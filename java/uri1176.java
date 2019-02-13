import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);

		long[] fib = new long[61];

		fib[0] = 0;
		fib[1] = 1;

		for (int i = 2; i < fib.length; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];

		}

		int n = inp.nextInt();

		for (int i = 0; i < n; i++) {
			int x = inp.nextInt();
			System.out.println("Fib(" + x + ") = " + fib[x]);
		}

	}
}