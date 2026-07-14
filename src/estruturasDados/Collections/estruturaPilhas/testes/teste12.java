package estruturasDados.Collections.estruturaPilhas.testes;

import estruturasDados.Collections.estruturaPilhas.Pilha;

public class teste12 {
    public static void main(String[] args) {
        String expressao = "((A+B)+D)";
        System.out.println(verificarParenteses(expressao));
    }
    public static boolean verificarParenteses(String expressao){
        Pilha<String> parenteses = new Pilha<>();
        String[] letras = expressao.split("");
        for (int i = 0; i < expressao.length(); i++) {
            if (letras[i].equals("(")){
                parenteses.empilhar(letras[i]);
            }else if (letras[i].equals(")")){
                parenteses.desempilhar();
            }
        }
        if (parenteses.estaVazia()){
            return true;
        }
        return false;
    }
}
