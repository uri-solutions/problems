import java.util.Scanner;
import java.io.IOException;

public class Main {

    private static Scanner inp;

    public static void main(String[] args) throws IOException {

        inp = new Scanner(System.in);

        String s1 = inp.nextLine();
        String s2 = inp.nextLine();
        String s3 = inp.nextLine();

        if (s1.equals("vertebrado")) {
            if (s2.equals("ave")) {
                {
                    if (s3.equals("carnivoro")) {
                        System.out.println("aguia");

                    } else {
                        System.out.println("pomba");
                    }

                }

                {

                }
            }
            if (s2.equals("mamifero")) {

                if (s3.equals("onivoro")) {
                    System.out.println("homem");
                } else {
                    System.out.println("vaca");
                }

            }

        } else if (s2.equals("inseto")) {

            if (s3.equals("hematofago")) {
                System.out.println("pulga");

            } else {
                System.out.println("lagarta");
            }
        } else {
            if (s3.equals("hematofago")){
                System.out.println("sanguessuga");
            } else {
                System.out.println("minhoca");
            }

        }
    }
}
