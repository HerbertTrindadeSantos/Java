package estruturasDados.Collections.estruturaPilhas.testes;

import estruturasDados.Collections.estruturaPilhas.Pilha;

public class teste03 {
    public static void main(String[] args) {
        Pilha<Integer> numeros = new Pilha<>(4);
        Pilha<Integer> numeros2 = new Pilha<>(4);
        numeros.empilhar(1);
        numeros.empilhar(2);
        numeros.empilhar(3);
        numeros.empilhar(4);
        System.out.println(numeros.estaVazia());
        System.out.println(numeros2.estaVazia());
    }
}
