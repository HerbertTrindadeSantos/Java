package interfaces.exe_02.application;

import interfaces.exe_02.entities.Contract;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Printer {

    private final static Scanner sc = new Scanner(System.in);
    private final static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Contract readContract() {
        System.out.println("Entre com os dados do contrato: ");
        System.out.print("Numero: ");
        int number = sc.nextInt();

        System.out.print("Data (dd/MM/yyyy): ");
        sc.nextLine();
        LocalDate date = LocalDate.parse(sc.nextLine(), fmt);

        System.out.print("Valor do contrato: R$");
        double valueTotal = sc.nextDouble();

        return new Contract(number, date, valueTotal);

    }

    public int readInstallment() {
        System.out.print("Entre com numero de parcelas:");
        int qtdInstallment = sc.nextInt();
        return qtdInstallment;
    }
}
