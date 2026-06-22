package estruturasDados.Collections.Vetor.testes;

import estruturasDados.Collections.Vetor.Lista.Lista;

public class teste09 {
    public static void main(String[] args) {
        Lista<Integer> numeros = new Lista<>();
        numeros.adicionar(1);
        numeros.adicionar(2);
        numeros.adicionar(3);
        numeros.adicionar(4);
        System.out.println(numeros.contem(4));
        System.out.println(numeros.contem(7));
    }
}
