import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		int N = 100, X, highest = 0, position = 0;
		Scanner input = new Scanner(System.in);
		int position2 = position;
		for (int i = 1; i <= N; i++) {
			X = input.nextInt();

			if (highest > X) {
				highest = highest;
				position = position2;
			} else {
				highest = X;
				position = i;
			}

		}
		System.out.print(highest + "\n" + position2 + "\n");
	}

}