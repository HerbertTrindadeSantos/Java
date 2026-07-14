package estruturasDados.Collections.estruturaPilhas.testes;

import estruturasDados.Collections.estruturaPilhas.Pilha;

public class teste11 {
    public static void main(String[] args) {
        String palavra = "ABBA";
        System.out.println(testaPalindromo(palavra));
    }

    public static boolean testaPalindromo(String palavra) {

        Pilha<Character> palindrome = new Pilha<>();

        for (int i = 0; i < palavra.length(); i++) {
            palindrome.empilhar(palavra.charAt(i));
        }
        String palavraInversa = "";
        while (!palindrome.estaVazia()) {
            palavraInversa += palindrome.desempilhar();
        }
        if (palavra.equalsIgnoreCase(palavraInversa)) {
            return true;
        }
        return false;
    }
}
