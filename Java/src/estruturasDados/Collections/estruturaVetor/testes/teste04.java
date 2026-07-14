package estruturasDados.Collections.estruturaVetor.testes;

import estruturasDados.Collections.estruturaVetor.Vetor;

public class teste04 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(3);
        vetor.adicionar("A");
        vetor.adicionar("B");
        vetor.adicionar("C");
        System.out.println(vetor.busca(3));
    }
}
