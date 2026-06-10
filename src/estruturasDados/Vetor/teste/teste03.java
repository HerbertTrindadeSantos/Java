package estruturasDados.Vetor.teste;

import estruturasDados.Vetor.vetores.Vetor;

public class teste03 {
    public static void main(String[] args) {

        Vetor vetor = new Vetor(1);
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("D");
        vetor.adiciona("P");
        vetor.insereElementos("G",1);
        System.out.println(vetor);
        vetor.removeElementos(3);
        System.out.println(vetor);
    }
}
