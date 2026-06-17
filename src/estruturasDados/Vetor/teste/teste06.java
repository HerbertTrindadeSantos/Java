package estruturasDados.Vetor.teste;

import estruturasDados.Vetor.Lista.Lista;

public class teste06 {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<>(2);
        lista.adiciona("A");
        lista.adiciona("B");
        System.out.println(lista.contem("B"));
    }
}
