package estruturasDados.Collections.estruturaFilas.testes;

import estruturasDados.Collections.estruturaFilas.Filas;

public class teste05 {
    public static void main(String[] args) {

        Filas<Documentos> filasDoc = new Filas<>();
        System.out.println("Enfileirando:");
        filasDoc.enfileirar(new Documentos("Programação imperativa",30));
        filasDoc.enfileirar(new Documentos("Física para computadores",25));
        filasDoc.enfileirar(new Documentos("Tecnologia da informacao",20));
        filasDoc.enfileirar(new Documentos("Sistemas de informacao",30));
        filasDoc.enfileirar(new Documentos("Cálculo I",15));
        System.out.println(filasDoc);
        System.out.println();
        System.out.println("Desenfileirando");
        while (!filasDoc.estaVazia()){
            System.out.println(filasDoc.desenfileirar());

        }



    }
}
