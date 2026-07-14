package estruturasDados.Collections.estruturaFilas.testes;

import estruturasDados.Collections.estruturaFilas.Filas;

public class teste01 {
    public static void main(String[] args) {
        Filas<Integer> filasNumeros = new Filas<>();
        filasNumeros.enfileirar(1);
        filasNumeros.enfileirar(2);
        filasNumeros.enfileirar(3);
        filasNumeros.enfileirar(4);
        System.out.println(filasNumeros);
        System.out.println(filasNumeros.espiar());
        filasNumeros.desenfileirar();
        System.out.println(filasNumeros);
        System.out.println(filasNumeros.espiar());
        filasNumeros.desenfileirar();
        System.out.println(filasNumeros);
        System.out.println(filasNumeros.espiar());
        filasNumeros.desenfileirar();
        System.out.println(filasNumeros);
    }
}
