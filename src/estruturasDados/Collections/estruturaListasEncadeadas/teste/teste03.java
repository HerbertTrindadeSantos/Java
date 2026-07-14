package estruturasDados.Collections.estruturaListasEncadeadas.teste;

import estruturasDados.Collections.estruturaListasEncadeadas.ListaEncadeada;

public class teste03 {
    public static void main(String[] args) {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(3);
        lista.adiciona(4);
        System.out.println(lista);
    }
}
