package introducao.Projeto_Interfaces.projeto_01.application;

import introducao.Projeto_Interfaces.projeto_01.entities.CarRental;
import introducao.Projeto_Interfaces.projeto_01.entities.Vehicle;
import introducao.Projeto_Interfaces.projeto_01.services.BrazilTaxService;
import introducao.Projeto_Interfaces.projeto_01.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel:");
        System.out.print("Modelo do carro:");
        String nameCar = sc.nextLine();
        System.out.print("Retirada (dd/MM/yyyy HH:mm):");
        LocalDateTime startDate = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.print("Retorno (dd/MM/yyyy HH:mm):");
        LocalDateTime finishDate = LocalDateTime.parse(sc.nextLine(), fmt);

        CarRental cr = new CarRental(startDate, finishDate, new Vehicle(nameCar));

        System.out.print("Digite o preco por hora:");
        double pricePerHour = sc.nextDouble();
        System.out.print("Digite o preco por dia:");
        double pricePerDay = sc.nextDouble();

        RentalService rs = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());
        rs.processInvoice(cr);

        System.out.println(cr.getInvoice().getBasicPayment());
        System.out.println(cr.getInvoice().getTax());
        System.out.println(cr.getInvoice().getTotalPayment());


        sc.close();
    }
}
