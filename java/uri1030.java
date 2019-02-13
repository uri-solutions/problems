import java.util.Scanner;

// Created by ygorazambuja 31/06/2017

public class Main {

    Node primal;
    Node freq;

    public Node Suicida(int qtdPessoas, int pulos) {
        Node node = this.primal;
        Node antAux = null;
        while (qtdPessoas > 1) {
            for (int i = 1; i < pulos; i++) {
                antAux = node;
                node = node.prox;
            }
            antAux.prox = node.prox;
            node = antAux.prox;
            qtdPessoas--;
        }
        return node;
    }

    public class Node {
        Integer valor = new Integer(0);
        Node prox = null;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int nCasosTeste = inp.nextInt();
        int cont = 0;
        while (cont < nCasosTeste) {
            int pessoas = inp.nextInt();
            int pulos = inp.nextInt();

            Main suicida = new Main();
            suicida.gerarLista(pessoas); 
            Node aux = suicida.Suicida(pessoas, pulos);
            cont++;
            System.out.println("Case " + cont + ": " + aux.valor);
        }

    }

    public void gerarLista(int quantPessoas) {

        for (int i = 1; i <= quantPessoas; i++) {

            if (this.primal == null) {
                this.primal = new Node();
                this.primal.valor = i;
                this.primal.prox = this.primal;
                this.freq = this.primal;
            } else {
                Node novoNode = new Node();
                novoNode.valor = i;
                this.freq.prox = novoNode;
                this.freq = novoNode;
                this.freq.prox = this.primal;

            }
        }
    }
}