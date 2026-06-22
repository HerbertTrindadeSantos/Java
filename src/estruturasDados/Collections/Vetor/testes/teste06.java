package estruturasDados.Collections.Vetor.testes;

import estruturasDados.Collections.Vetor.Vetor;

public class teste06 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(3);
        vetor.adicionar("A");
        vetor.adicionar("B");
        vetor.adicionar("C");
        vetor.adicionar("D");
        vetor.adicionar("E");
        System.out.println(vetor);
    }
}
