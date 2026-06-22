package estruturasDados.Collections.Vetor.testes;

import estruturasDados.Collections.Vetor.Vetor;

public class teste02 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(4);
        vetor.adicionar("A");
        vetor.adicionar("B");
        vetor.adicionar("C");
        vetor.adicionar("C");
        System.out.println(vetor.tamanho());
        System.out.println(vetor);
    }
}
