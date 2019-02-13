import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);

		int x = inp.nextInt();

		for (int i = 0; i < x; i++) {

			int n = inp.nextInt();

			int cont = inp.nextInt();

			int k = n;
			int aux = n;

			if (n % 2 != 0) {
				while (cont > 1) {
					k += 2;
					n = n + k;
					cont--;
				}
			} else if (n % 2 == 0) {

				n = n + 1;
				k = k + 1;
				while (cont > 1) {
					k += 2;
					n = n + k;
					cont--;

				}

			}
			System.out.println(n);
		}

	}

}