package estruturasDados.Collections.estruturaPilhas.testes;

import estruturasDados.Collections.estruturaPilhas.Pilha;

public class teste10 {
    public static void main(String[] args) {
        Pilha<String> palindromos = new Pilha<>();
        String nome = "AABCCBAA";
        String[] letras = nome.split("");
        System.out.println(letras.length);
        for (int i = 0; i < letras.length; i++) {
            palindromos.empilhar(letras[i]);
        }
        String inverso = "";
        for (int i = palindromos.tamanho(); i > 0; i--) {
            inverso = inverso + palindromos.desempilhar();
        }
        System.out.println(inverso);
        if (nome.equalsIgnoreCase(inverso)) {
            System.out.println("Os nomes sao palindromos");
        } else {
            System.out.println("Os nomes nao sao palindromos");
        }
    }
}
