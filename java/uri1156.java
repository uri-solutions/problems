public class Main {

	public static void main(String[] args) {

		double a = 3;
		double b = 2;
		double s = 1;

		boolean cond = false;

		while (!cond) {
			s += a / b;
			a += 2;
			b += b;

			if (a == 39) {
				cond = true;
			}
		}

		System.out.printf("%.2f\n", s);

	}

}+