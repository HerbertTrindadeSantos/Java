package estruturasDados.Collections.Vetor.testes;

import estruturasDados.Collections.Vetor.Vetor;

public class teste05 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(6);
        vetor.adicionar("A");
        vetor.adicionar("B");
        vetor.adicionar("C");
        vetor.adicionar("D");
        vetor.adicionar("E");
        vetor.adicionar("G",0);
        System.out.println(vetor);
    }
}
