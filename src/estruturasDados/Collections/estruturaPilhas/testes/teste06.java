package estruturasDados.Collections.estruturaPilhas.testes;

import estruturasDados.Collections.estruturaPilhas.Pilha;

import java.util.Scanner;

public class teste06 {
    public static void main(String[] args) {
        Pilha<Integer> numbers = new Pilha<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Numero #" + (i + 1) + ":");
            int number = sc.nextInt();
            if (!(number % 2 == 0)) {
                if (numbers.estaVazia()) {
                    System.out.println("Pilha está vazia, não há o que desempilhar! ");
                } else {
                    System.out.println("Desempilhando numero: " + numbers.topo());
                    numbers.desempilhar();
                }
            } else {
                System.out.println("Empilhando numero: " + number);
                numbers.empilhar(number);
            }
        }
        if (!(numbers.estaVazia())) {
            for (int i = numbers.tamanho(); i > 0; i--) {
                System.out.println("Desempilahndo numero: " + numbers.desempilhar());
            }
        }
        System.out.println("Todos os numeros foram desempilhados");
        sc.close();
    }
}
