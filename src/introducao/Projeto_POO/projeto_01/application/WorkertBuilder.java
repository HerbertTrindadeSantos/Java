package introducao.Projeto_POO.projeto_01.application;

import introducao.Projeto_POO.projeto_01.model.entities.*;
import introducao.Projeto_POO.projeto_01.model.enums.TypeDepartment;
import introducao.Projeto_POO.projeto_01.model.enums.WorkerLevel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class WorkertBuilder {
    private final DateTimeFormatter fmt;
    private final Scanner sc;

    public WorkertBuilder(DateTimeFormatter fmt, Scanner sc){
        this.fmt = fmt;
        this.sc = sc;
    }

    public WorkerLevel readLevel(){
        int indexLevel = readInt("Nivel-[1-JUNIOR;2-PLENO;3-SENIOR]:");
        return WorkerLevel.fromCode(indexLevel);
    }


    public Department createDepartment() {
            int indexDepartment = readInt("Digite o departamento:[1-Administracao/2-Vendas/3-Recepcao]");
            TypeDepartment type = TypeDepartment.fromCode(indexDepartment);
            return switch (type) {
                case ADMINISTRACAO -> createAdminDept(type);
                case VENDAS -> createSalesDept(type);
                case RECEPCAO -> createRecepcionDept(type);
            };
        }

    public Worker readWorker() {
        System.out.print("Nome: ");
        String name = sc.nextLine();
        LocalDate birthday = readDate("Data de nascimento (DD/MM/YYYY):");
        int daysWork = readInt("Digite os dias trabalhados:");
        return new Worker(name, birthday, daysWork,createDepartment());
    }

    public Department createAdminDept(TypeDepartment type){
        int qtdProjects = readInt("Digite a quantidade de projetos feitos:");
        return new AdminDept(readLevel(),type,qtdProjects);
    }

    public Department createSalesDept(TypeDepartment type){
        int qtdSales = readInt("Digite a quantidade de vendas realizadas:");
        return new SalesDept(readLevel(),type,qtdSales);
    }

    public Department createRecepcionDept(TypeDepartment type){
        int qtdPeoplesAtt = readInt("Digite a quantidade de pessoas atendidas:");
        return new RecepcionDept(readLevel(),type,qtdPeoplesAtt);
    }

    public int readInt(String prompt){
        do {
            try{
                System.out.print(prompt);
                return Integer.parseInt(sc.nextLine().trim());
            }catch (NumberFormatException e){
                System.out.println("Formato incorreto.Digite um numero inteiro.");
            }
        }while(true);
    }

    public LocalDate readDate(String prompt){
        do {
            try {
                System.out.print(prompt);
                return LocalDate.parse(sc.nextLine().trim(),fmt);
            }catch (DateTimeParseException e){
                System.out.println("Formato incorreto de data.Utilize (dd/MM/yyyy)");
            }
        }while(true);
    }

}
