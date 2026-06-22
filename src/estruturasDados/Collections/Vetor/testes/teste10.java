package estruturasDados.Collections.Vetor.testes;

import estruturasDados.Collections.Vetor.Lista.Lista;

public class teste10 {
    public static void main(String[] args) {
        Lista<String> nomes = new Lista<>();
        nomes.adicionar("Arvore");
        nomes.adicionar("Arvore");
        nomes.adicionar("Teclado");
        nomes.adicionar("Ciclete");
        nomes.adicionar("Arvore");
        System.out.println(nomes.ultimaOcorrencia("Arvore"));
        System.out.println(nomes.ultimaOcorrencia("Filho"));
    }
}
