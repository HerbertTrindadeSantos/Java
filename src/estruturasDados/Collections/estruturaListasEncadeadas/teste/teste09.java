package estruturasDados.Collections.estruturaListasEncadeadas.teste;

import estruturasDados.Collections.estruturaListasEncadeadas.ListaEncadeada;

public class teste09 {
    public static void main(String[] args) {
        ListaEncadeada<String> lista = new ListaEncadeada<>();
        lista.adiciona("Livro");
        lista.adiciona("Termometro");
        lista.adiciona("Frigideira");
        lista.adiciona("Bicicleta");
        System.out.println(lista);
        lista.adiciona(0,"Celular");
        System.out.println(lista);
        lista.adiciona(1,"Carro");
        System.out.println(lista);
        lista.adiciona(2,"Televisao");
        System.out.println(lista);
        lista.adiciona(3,"Visionario");
        System.out.println(lista);
        lista.adiciona(4,"Festa");
        System.out.println(lista);
        lista.adiciona(9,"Voley");
        System.out.println(lista);

    }
}
