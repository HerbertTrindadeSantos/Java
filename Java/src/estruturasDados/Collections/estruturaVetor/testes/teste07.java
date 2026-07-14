package estruturasDados.Collections.estruturaVetor.testes;

import estruturasDados.Collections.estruturaVetor.Vetor;

public class teste07 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(3);
        vetor.adicionar("A");
        vetor.adicionar("B");
        vetor.adicionar("C");
        vetor.adicionar("D");
        vetor.adicionar("E");
        vetor.remover(0);
        System.out.println(vetor);
        System.out.println(vetor.tamanho());
    }
}
