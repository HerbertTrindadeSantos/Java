package estruturasDados.Collections.estruturaPilhas.testes;

import estruturasDados.Collections.estruturaPilhas.Pilha;

public class teste02 {
    public static void main(String[] args) {
        Pilha<Integer> numeros = new Pilha<>(4);
        numeros.empilhar(1);
        numeros.empilhar(2);
        numeros.empilhar(3);
        numeros.empilhar(4);
        System.out.println(numeros);
        System.out.println(numeros.tamanho());
        numeros.desempilhar();
        System.out.println(numeros);
        System.out.println(numeros.tamanho());
        numeros.desempilhar();
        System.out.println(numeros);
        System.out.println(numeros.tamanho());
        numeros.desempilhar();
        System.out.println(numeros);
        System.out.println(numeros.tamanho());
        numeros.desempilhar();
        System.out.println(numeros);
        System.out.println(numeros.tamanho());

    }
}
