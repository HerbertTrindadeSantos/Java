package interfaces.exe_01.application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Printer {

    private final static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    private final static Scanner sc = new Scanner(System.in);

    public Printer() {
    }

    public String readName() {
        System.out.println("Entre com os dados do aluguel:");
        System.out.print("Modelo do carro: ");
        String carName = sc.nextLine();
        return carName;
    }

    public LocalDateTime readDateStart() {
        System.out.print("Retirada (dd/MM/yyyy hh:mm):");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
        return start;
    }

    public LocalDateTime readDateFinish() {
        System.out.print("Retirada (dd/MM/yyyy hh:mm):");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);
        return finish;
    }

    public double readPricePerHour() {
        System.out.print("Entre com o preco por hora: R$");
        double pricePerHour = sc.nextDouble();
        return pricePerHour;
    }

    public double readPricePerDay() {
        System.out.print("Entre com o preco por dia: R$");
        double pricePerDay = sc.nextDouble();
        return pricePerDay;
    }
}
