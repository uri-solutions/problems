import java.util.Scanner;
import java.io.IOException;

public class Main {

	private static Scanner inp;

	public static void main(String[] args) throws IOException {

		inp = new Scanner(System.in);

		double A, B, C,D ;
		A = inp.nextDouble();
		B = inp.nextDouble();
		C = inp.nextDouble();
		double x1, x2;
		D = Math.pow(B, 2) - (4 * A * C);

		x1 = ((-B) + (Math.sqrt(D))) / (2 * A);
		x2 = ((-B) - (Math.sqrt(D))) / (2 * A);
		
		//double D = 0;
		if (A != 0 && D > 0) {
			
			System.out.printf("R1 = %.5f\n", x1);
			System.out.printf("R2 = %.5f\n", x2);

		} else {
			System.out.println("Impossivel calcular");
		}

	}
}
