package interfaces.exe_01.services;

import interfaces.exe_01.entities.CarHental;
import interfaces.exe_01.entities.Invoice;

import java.time.temporal.ChronoUnit;

public class RentalService {

    private Double pricePerHour;
    private Double pricePerDay;

    private final static int MAX_HOUR = 12;

    private TaxService taxService;

    public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public Double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(Double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public Double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(Double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public void processInvoice(CarHental carHental) {
        double hours = Math.ceil(ChronoUnit.MINUTES.between(carHental.getStart(), carHental.getFinish()) / 60.0);

        double basicPayment = 0.0;

        if (hours < MAX_HOUR) {
            basicPayment = this.pricePerHour * hours;
        } else {
            basicPayment = this.pricePerDay * Math.ceil(hours / 24.0);
        }

        carHental.setInvoice(new Invoice(basicPayment,taxService.tax(basicPayment)));
    }
}
