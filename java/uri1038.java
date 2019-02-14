import java.util.Scanner;
import java.io.IOException;

public class Main {

	private static Scanner inp;

	public static void main(String[] args) throws IOException {

		inp = new Scanner(System.in);

		int x, y;
		double n1 = 4.00, n2 = 4.50, n3 = 5.00, n4 = 2.00, n5 = 1.50, total = 0;

		x = inp.nextInt();
		y = inp.nextInt();
		

		switch (x) {

		case 1:
			x = 1;
			total = n1 * y;
			break;
		case 2:
			x = 2;
			total = n2 * y;
			break;
		case 3:
			x = 3;
			total = n3 * y;
			break;
		case 4:
			x = 4;
			total = n4 * y;
			break;
		case 5:
			x = 5;
			total = n5 * y;
			break;

		}

		System.out.printf("Total: R$ %.2f\n",total);

	}
}
