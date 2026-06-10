package introducao.Projeto_Interfaces.projeto_01.services;

import introducao.Projeto_Interfaces.projeto_01.entities.CarRental;
import introducao.Projeto_Interfaces.projeto_01.entities.Invoice;

import java.time.temporal.ChronoUnit;


public class RentalService {
    private double pricePerDay;
    private double pricePerHour;

    private TaxService taxService;

    public RentalService(double pricePerDay, double pricePerHour, TaxService taxService) {
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.taxService = taxService;
    }

    public TaxService getTaxService() {
        return taxService;
    }

    public void setTaxService(TaxService taxService) {
        this.taxService = taxService;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public double getPricePerHour() {
        return pricePerHour;
    }

    public void processInvoice(CarRental carRental) {
         double amount = 0.0;
        double minutes = ChronoUnit.MINUTES.between(carRental.getStart(),carRental.getFinish());
        double hour = Math.ceil(minutes / 60);
        if (hour <= 12L) {
            amount = (this.pricePerHour * hour);
        } else {
            amount = (this.pricePerDay * hour/24.0);
        }
        carRental.setInvoice(new Invoice(amount, taxService.tax(amount)));
    }
}
