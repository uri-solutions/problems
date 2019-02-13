
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);

		int x = inp.nextInt();
		int y = inp.nextInt();
		double tg, t;

		t = x * y;
		tg = t / 12;

		System.out.printf("%.3f", tg);
		System.out.println("");

	}

}
