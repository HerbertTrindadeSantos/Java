package estruturasDados.Collections.Pilhas.testes;


import estruturasDados.Collections.Pilhas.estatica.Pilha;

public class teste01 {
    public static void main(String[] args) {

        Pilha<Integer> pilhaNumeros = new Pilha<>();

        for (int i = 0; i < 10; i++) {
            pilhaNumeros.empilhar(i);
        }
        System.out.println(pilhaNumeros);
        System.out.println(pilhaNumeros.tamanho());
    }
}
