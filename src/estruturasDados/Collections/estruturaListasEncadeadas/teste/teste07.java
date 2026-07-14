package estruturasDados.Collections.estruturaListasEncadeadas.teste;

import estruturasDados.Collections.estruturaListasEncadeadas.ListaEncadeada;

public class teste07 {
    public static void main(String[] args) {
        ListaEncadeada<String> lista = new ListaEncadeada<>();
        lista.adiciona("Livro");
        lista.adiciona("Termometro");
        lista.adiciona("Frigideira");
        lista.adiciona("Bicicleta");
        System.out.println(lista.buscaPosicao("Bicicleta"));
        System.out.println(lista.buscaPosicao("Bebe"));
    }
}
