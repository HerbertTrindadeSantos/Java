package estruturasDados.Collections.estruturaListasEncadeadas.teste;

import estruturasDados.Collections.estruturaListasEncadeadas.ListaEncadeada;

public class teste08 {
    public static void main(String[] args) {
        ListaEncadeada<String> lista = new ListaEncadeada<>();
        lista.adiciona("Livro");
        lista.adiciona("Termometro");
        lista.adiciona("Frigideira");
        lista.adiciona("Bicicleta");
        System.out.println(lista.RemoverFinal(0));
        System.out.println(lista.RemoverFinal(1));
        System.out.println(lista.RemoverFinal(2));
        System.out.println(lista.RemoverFinal(3));
        System.out.println(lista.RemoverFinal(-1));
    }
}
