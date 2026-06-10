package introducao.Projeto_POO.projeto_01.application;

import introducao.Projeto_POO.projeto_01.model.entities.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        WorkertBuilder builder = new WorkertBuilder(fmt, sc);

        List<Worker> workers = new ArrayList<>();
        System.out.println("=======REGISTRO SALARIAL========");
        int qtdEmployee = builder.readInt("Quantidade de Funcionários:");
        for (int i = 1; i <= qtdEmployee; i++) {
            System.out.println("----------------------------------------");
            System.out.println("Digite os dados do servidor #" + i + ":");
            workers.add(builder.readWorker());
        }
        System.out.println();
        System.out.println("========================================");
        System.out.println("           RELATORIO SALARIAL        ");
        System.out.println("========================================");
        for (Worker wk : workers) {
            System.out.println(wk.toString());
        }
    }
}
