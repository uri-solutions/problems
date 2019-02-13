import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);

		double a = inp.nextDouble(), b = inp.nextDouble(), c = inp.nextDouble();
		


		System.out.printf("TRIANGULO: %.3f",((a*c)/2));
		System.out.println();
		System.out.printf("CIRCULO: %.3f", (3.14159)*(Math.pow(c,2)));
		System.out.println();
		System.out.printf("TRAPEZIO: %.3f", ((a+b)*c)/2);
		System.out.println();
		System.out.printf("QUADRADO: %.3f",(b*b));
		System.out.println();
		System.out.printf("RETANGULO: %.3f", (a*b));
		System.out.println();

	}

}
