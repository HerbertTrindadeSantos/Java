package estruturasDados.Vetor.teste;

import estruturasDados.Vetor.vetores.VetorGenerico;

public class teste05 {
    public static void main(String[] args) {

        VetorGenerico vetor = new VetorGenerico(2);
        vetor.adiciona("X");
        vetor.adiciona("A");
        System.out.println(vetor.contem("A"));
        System.out.println(vetor.contem("Z"));
    }
}
