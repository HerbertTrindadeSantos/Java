package estruturasDados.Collections.Vetor.testes;

import estruturasDados.Collections.Vetor.Lista.Lista;

public class teste12 {
    public static void main(String[] args) {
        Lista<String> nomes = new Lista<>();
        nomes.adicionar("Arvore");
        nomes.adicionar("Teclado");
        nomes.adicionar("Ciclete");
        System.out.println(nomes.obtem(2));
        System.out.println(nomes.obtem(3));
    }
}
