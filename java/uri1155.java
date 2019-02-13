public class Main {

	public static void main(String[] args) {

		float s = 0;
		

		for (float i = 1; i <= 100; i++) {

			s += 1/i;
		}

		System.out.printf("%.2f\n", s);

	}

}