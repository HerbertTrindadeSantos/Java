package estruturasDados.Collections.estruturaFilas.testes;

import estruturasDados.Collections.estruturaFilas.FilaComPrioridade;

public class teste02 {
    public static void main(String[] args) {
        FilaComPrioridade<Integer> filas = new FilaComPrioridade<>();

        filas.enfileirar(1);
        filas.enfileirar(3);
        filas.enfileirar(2);
        filas.enfileirar(5);
        filas.enfileirar(1);
        filas.enfileirar(6);
        filas.enfileirar(3);
        System.out.println(filas);
    }
}
