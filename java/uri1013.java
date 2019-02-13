
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);

		int a, b, abs, maiorAB;

		a = inp.nextInt();
		b = inp.nextInt();
		abs = inp.nextInt();

		if (a > b && a > abs) {
			System.out.println(a + " eh o maior");

		} else if (b > a && b > abs) {
			System.out.println(b + " eh o maior");

		} else {
			System.out.println(abs + " eh o maior");

		}

	}

}
