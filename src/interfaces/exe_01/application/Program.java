package interfaces.exe_01.application;

import interfaces.exe_01.entities.CarHental;
import interfaces.exe_01.entities.Vehicle;
import interfaces.exe_01.services.BrazilTaxService;
import interfaces.exe_01.services.RentalService;

import java.time.LocalDateTime;
import java.util.Locale;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

       Printer pr = new Printer();

       String carName = pr.readName();

       LocalDateTime start = pr.readDateStart();

       LocalDateTime finish = pr.readDateFinish();

       double pricePerHour = pr.readPricePerHour();

       double pricePerDay = pr.readPricePerDay();

        CarHental carHental = new CarHental(start,finish,new Vehicle(carName));

        RentalService rs = new RentalService(pricePerHour,pricePerDay,new BrazilTaxService());

        rs.processInvoice(carHental);

        System.out.println();

        System.out.println(carHental);

    }
}
