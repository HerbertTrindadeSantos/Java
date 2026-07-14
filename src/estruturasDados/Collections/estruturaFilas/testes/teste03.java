package estruturasDados.Collections.estruturaFilas.testes;

import estruturasDados.Collections.estruturaFilas.FilaComPrioridade;

public class teste03 {
    public static void main(String[] args) {

        FilaComPrioridade<Paciente> filasPacientes = new FilaComPrioridade<>();

        filasPacientes.enfileirar(new Paciente("A",1));
        filasPacientes.enfileirar(new Paciente("G",1));
        filasPacientes.enfileirar(new Paciente("B",3));
        filasPacientes.enfileirar(new Paciente("C",2));
        System.out.println(filasPacientes);
    }
}
