package estruturasDados.Vetor.teste;

import estruturasDados.Vetor.vetores.Vetor;

public class teste04 {
    public static void main(String[] args) {


        Vetor vetor = new Vetor(1);
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("D");
        vetor.adiciona("P");
        int pos = vetor.buscaNome("D");
        vetor.removeElementos(pos);
        System.out.println(vetor);
    }
}
