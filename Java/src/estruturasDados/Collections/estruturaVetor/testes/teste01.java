package estruturasDados.Collections.estruturaVetor.testes;

import estruturasDados.Collections.estruturaVetor.Vetor;

public class teste01 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(2);
        vetor.adicionar("A");
        vetor.adicionar("B");
        System.out.println(vetor);
    }
}
