package estruturasDados.Collections.estruturaPilhas.testes;

import estruturasDados.Collections.estruturaPilhas.Pilha;

public class teste04 {
    public static void main(String[] args) {
        Pilha<Integer> numeros = new Pilha<>(5);
        Pilha<Integer> numeros2 = new Pilha<>();
        numeros.empilhar(1);
        numeros.empilhar(2);
        numeros.empilhar(3);
        numeros.empilhar(4);
        System.out.println(numeros.topo());
        System.out.println(numeros2.topo());

    }
}
