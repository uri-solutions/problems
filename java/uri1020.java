import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);

		int x = inp.nextInt();
		int conta = 0;
		int contm = 0;
		int contd = 0;
		
		
		while (x>=365) {
			
			x = x-365;
			conta++;
					
		}
		while (x>=30){
			x = x-30;
			contm++;
			
		}
		//while(x>=1)
		System.out.println(conta+" ano(s)");
		System.out.println(contm+" mes(es)");
		System.out.println(x+" dia(s)");
		

	}

}
