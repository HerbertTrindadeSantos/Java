package estruturasDados.Collections.estruturaListasEncadeadas.teste;

import estruturasDados.Collections.estruturaListasEncadeadas.ListaEncadeada;

public class teste08 {
    public static void main(String[] args) {
        ListaEncadeada<String> lista = new ListaEncadeada<>();
        lista.adiciona("Livro");
        lista.adiciona("Termometro");
        lista.adiciona("Frigideira");
        lista.adiciona("Bicicleta");
        System.out.println(lista.buscaElemento(0));
        System.out.println(lista.buscaElemento(1));
        System.out.println(lista.buscaElemento(2));
        System.out.println(lista.buscaElemento(3));
        System.out.println(lista.buscaElemento(-1));
    }
}
