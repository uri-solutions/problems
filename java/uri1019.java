
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);

		int x = inp.nextInt();
		int contm = 0;
		int conth = 0;

		while (x >= 3600){
			x = x-3600;
				conth++;
			
		}
		while (x >= 60) {

			x = x - 60;
			contm++;
		}
		System.out.printf(conth+":"+contm+":"+x);
		System.out.println("");
		

	}

}
