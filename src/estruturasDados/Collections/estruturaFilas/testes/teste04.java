package estruturasDados.Collections.estruturaFilas.testes;

import java.util.PriorityQueue;
import java.util.Queue;

public class teste04 {
    public static void main(String[] args) {

        Queue<Paciente> filasComPrioridade = new PriorityQueue<>();

        filasComPrioridade.add(new Paciente("Felipe",3));
        filasComPrioridade.add(new Paciente("Fernanda",1));
        filasComPrioridade.add(new Paciente("Gabriela",2));
        filasComPrioridade.add(new Paciente("Gabriela",2));
        System.out.println(filasComPrioridade);
    }
}
