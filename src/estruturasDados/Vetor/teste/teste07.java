package estruturasDados.Vetor.teste;

import estruturasDados.Vetor.Lista.Lista;

public class teste07 {
    public static void main(String[] args) {
        Lista<Integer> lista = new Lista<>(2);
        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(2);
        lista.adiciona(2);
        lista.adiciona(2);
        System.out.println(lista.BuscaUltimaPosicaoElemento(2));
    }
}
