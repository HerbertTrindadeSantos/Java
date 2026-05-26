package estruturasDados.vetor.teste;

import estruturasDados.vetores.Vetor;

public class teste01 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(5, 0);
        vetor.adiciona("Elemento 0");
        vetor.adiciona("Elemento 1");
        vetor.adiciona("Elemento 2");
        vetor.adiciona("Elemento 3");

        System.out.println(vetor.getTamanho());
        System.out.println(vetor);
        System.out.println(vetor.buscaNome("Elemento 1"));
        System.out.println(vetor.buscaPosicao(2));
        vetor.insereElementos("Elemento 0",0);
        vetor.insereElementos("Elemento 2",2);
        vetor.insereElementos("Elemento 1",1);
        System.out.println(vetor);
        vetor.removeElementos(2);
        System.out.println(vetor);


    }
}
