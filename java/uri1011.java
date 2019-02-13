import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);

		double r = inp.nextDouble();
		double esf;

		esf = ((4/3.0)*(3.14159)*(Math.pow(r,3)));
		
		System.out.printf("VOLUME = %.3f",esf);
		System.out.println();
		
		
	}

}