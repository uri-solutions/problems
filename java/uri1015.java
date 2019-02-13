
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);

		double resul;
		double x1 = inp.nextDouble();
		double y1 = inp.nextDouble();
		double x2 = inp.nextDouble();
		double y2 = inp.nextDouble();
		
			
			resul = Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));
		System.out.printf("%.4f",resul);
		System.out.println("");
		

		
		
	}

}
