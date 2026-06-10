package estruturasDados.Vetor.teste;

import estruturasDados.Vetor.vetores.VetorObjetos;

public class teste05 {
    public static void main(String[] args) {

        VetorObjetos vetorObjetos = new VetorObjetos(2);
        vetorObjetos.adiciona(1);
        vetorObjetos.adiciona("A");
        System.out.println(vetorObjetos);
    }
}
