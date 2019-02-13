import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);

		boolean cond = false;
		while (!cond) {
			int n = inp.nextInt();
			if (n == 0) {
				cond = true;
				break;

			}
			int cont = 5;

			int i = n;
			int aux = n;

			if (n % 2 == 0) {
				while (cont > 1) {
					i += 2;
					n = n + i;
					cont--;
				}
			} else if (n % 2 != 0) {

				n = n + 1;
				i = i + 1;
				while (cont > 1) {
					i += 2;
					n = n + i;
					cont--;

				}

			}
			System.out.println(n);

		}

	}

}