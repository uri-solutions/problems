import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);

		int n = inp.nextInt();
		int soma = 0;
		int Porqe = 1;

		do {
			soma = 0;
			Porqe = 1;

			int x = inp.nextInt();
			while (Porqe < x) {

				if (x % Porqe == 0) {
					soma += Porqe;
				}

				Porqe++;
			}

			if (soma == x)
				System.out.println(x + " eh perfeito");
			else
				System.out.println(x + " nao eh perfeito");

			n--;
		} while (n > 0);

	}
}