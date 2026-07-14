package estruturasDados.Collections.estruturaFilas.testes;

import estruturasDados.Collections.estruturaFilas.FilaComPrioridade;
import estruturasDados.Collections.estruturaFilas.Filas;


public class teste06 {
    public static void main(String[] args) {
        FilaComPrioridade<String> filaComPrioridade = new FilaComPrioridade<>();
        Filas<String> filas = new Filas<>();
        final int MAX_PRIORIDADE = 3;

        filas.enfileirar("Pessoa 1");
        filas.enfileirar("Pessoa 2");
        filas.enfileirar("Pessoa 3");
        filaComPrioridade.enfileirar("Pessoa 1P");
        filaComPrioridade.enfileirar("Pessoa 2P");
        filaComPrioridade.enfileirar("Pessoa 3P");
        filaComPrioridade.enfileirar("Pessoa 4P");
        filaComPrioridade.enfileirar("Pessoa 5P");
        filas.enfileirar("Pessoa 4");
        filas.enfileirar("Pessoa 5");
        filas.enfileirar("Pessoa 6");
        filas.enfileirar("Pessoa 7");
        filas.enfileirar("Pessoa 8");
        filas.enfileirar("Pessoa 9");
        filas.enfileirar("Pessoa 10");

        while(!(filaComPrioridade.estaVazia() || filas.estaVazia())){
            int contPrioridade = 0;
            while (!filaComPrioridade.estaVazia() && contPrioridade < MAX_PRIORIDADE){
                atendimentoPessoas(filaComPrioridade);
                contPrioridade++;
            }
            if (!filas.estaVazia()){
                atendimentoPessoas(filas);
            }
            if (filaComPrioridade.estaVazia()){
                while (!filas.estaVazia()){
                    atendimentoPessoas(filas);
                }
            }
        }

    }
    public static void atendimentoPessoas(Filas<String> filas){
        String pessoaAtendida = filas.desenfileirar();
        System.out.println(pessoaAtendida + " Foi atendida");
    }
}
