import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = "LIFE IS NOT A PROBLEM TO BE SOLVED";

        char[] vet = s.toCharArray();

        int n = inp.nextInt();

        for (int i = 0; i < n ; i++) {
            System.out.print(vet[i]);
        }
        System.out.println();

    }
}
