package estruturasDados.Collections.estruturaPilhas.testes;

import estruturasDados.Collections.estruturaPilhas.Pilha;

import java.util.Scanner;

public class teste07 {
    public static void main(String[] args) {

        Pilha<Integer> numerosPares = new Pilha<>();
        Pilha<Integer> numerosImpares = new Pilha<>();

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Numero #" + (i + 1) + ":");
            int number = sc.nextInt();
            if (number == 0) {
               if (numerosPares.estaVazia()){
                   System.out.println("Não há mais elementos para desempilhar");
               }else{
                   System.out.println("Desempilhando elemento " + numerosPares.topo());
                   numerosPares.desempilhar();
               }
                if (numerosImpares.estaVazia()){
                    System.out.println("Não há mais elementos para desempilhar");
                }else {
                    System.out.println("Desempilhando elemento " + numerosImpares.topo());
                    numerosImpares.desempilhar();
                }
            } else if (number % 2 == 0) {
                System.out.println("Empilhando elemento "+ number);
                numerosPares.empilhar(number);
            } else {
                System.out.println("Empilhando elemento "+ number);
                numerosImpares.empilhar(number);
            }
        }
        System.out.println();
        while (!(numerosPares.estaVazia() && numerosImpares.estaVazia())){
            if (numerosPares.estaVazia()){
                System.out.println("Não há mais elementos para desempilhar");
            }else{
                System.out.println("Dempilhando elemento " + numerosPares.topo());
                numerosPares.desempilhar();
            }
            if (numerosImpares.estaVazia()){
                System.out.println("Não há mais elementos para desempilhar");
            }else {
                System.out.println("Desempilhando elemento " + numerosImpares.topo());
                numerosImpares.desempilhar();
            }
        }

        sc.close();
    }
}
