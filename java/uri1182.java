import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double[][] matriz = new double[12][12];
        int coluna = inp.nextInt();
        String op = inp.next(); // Linha considerada para operação.
        double resul = 0;
        double media = 0;
        switch (op) {
            case ("S"):
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz.length; j++) {
                        matriz[i][j] = inp.nextDouble();
                        if (j == coluna) {
                            resul += matriz[i][j];
                        }
                    }
                }
                System.out.println(resul);
                break;
            case ("M"):
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz.length; j++) {
                        matriz[i][j] = inp.nextDouble();
                        if (j == coluna) {
                            media += matriz[i][j];
                        }
                    }
                }
                media = media / matriz[coluna].length;
                System.out.printf("%.1f", media);
                System.out.println();
                break;
        }
    }
}
