package estruturasDados.Vetor.teste;

import estruturasDados.Vetor.vetores.Vetor;

public class teste02 {
    public static void main (String[] args){

        Vetor vetor = new Vetor(1);
        vetor.adiciona("B");
        vetor.adiciona("C");
        System.out.println(vetor.buscaPosicao(1));
        System.out.println(vetor.buscaNome("B"));
        System.out.println(vetor);
    }
}
