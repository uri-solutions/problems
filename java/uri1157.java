import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);

		int n = inp.nextInt();
		int i = 1;

		while (i <= n) {

			if (n % i == 0) {
				
				System.out.println(i);
						
			}
			i++;
		}

	}

}