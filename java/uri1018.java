import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);

		int x = inp.nextInt();
		int cont100 = 0;
		int cont50 = 0;
		int cont20 = 0;
		int cont10 = 0;
		int cont5 = 0;
		int cont2 = 0;
		int cont1 = 0;
		int aux = x;
		
		while (x >= 100) {
			x = x - 100;
			cont100++;

		}
		
		while(x>=50){
			x = x -50;
			cont50++;
						
		}
		while(x>=20){
			x = x-20;
			cont20++;
		}
		while(x>=10){
			x= x-10;
			cont10++;
			
		}
		while(x>=5){
			x= x-5;
			cont5++;
			
		}
		while(x>=2){
			x= x-2;
			cont2++;
			
		}
		while(x>=1){
			x= x-1;
			cont1++;
			
		}
		System.out.println(aux);
		System.out.printf("%d nota(s) de R$ 100,00",cont100);
		System.out.println();
		System.out.printf("%d nota(s) de R$ 50,00",cont50);
		System.out.println();
		System.out.printf("%d nota(s) de R$ 20,00",cont20);
		System.out.println();
		System.out.printf("%d nota(s) de R$ 10,00",cont10);
		System.out.println();
		System.out.printf("%d nota(s) de R$ 5,00",cont5);
		System.out.println();
		System.out.printf("%d nota(s) de R$ 2,00",cont2);
		System.out.println();
		System.out.printf("%d nota(s) de R$ 1,00",cont1);
		System.out.println();
		

	}

}
