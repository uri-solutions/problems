import java.util.Scanner;

public class Main {
	public static void main (String[]args){
		
		Scanner inp = new Scanner(System.in);
		
		int cod1 = inp.nextInt(), n1 = inp.nextInt();double v1 = inp.nextDouble();
		int cod2 = inp.nextInt(), n2 = inp.nextInt();double v2 = inp.nextDouble();
		double vt;
		
		
		
		vt = ((n1*v1)+(n2*v2));
		System.out.printf("VALOR A PAGAR: R$ %.2f",vt);
		System.out.println("");
		
		
		
	}

}
