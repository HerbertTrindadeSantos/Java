package estruturasDados.Collections.estruturaArvores.teste;

import estruturasDados.Collections.estruturaArvores.Arvore;
import estruturasDados.Collections.estruturaArvores.Folha;

public class teste01 {
    public static void main(String[] args) {
        Arvore arvore = new Arvore(new Folha(30));
        arvore.inserir(new Folha(45));
        arvore.inserir(new Folha(15));
        arvore.inserir(new Folha(7));
        arvore.inserir(new Folha(19));
        System.out.println(arvore);
    }
}
