package interfaces.exe_01.entities;

import java.time.LocalDateTime;

public class CarHental {

    private LocalDateTime start;
    private LocalDateTime finish;

    private Vehicle vehicle;
    private Invoice invoice;

    public CarHental(LocalDateTime start, LocalDateTime finish, Vehicle vehicle) {
        this.start = start;
        this.finish = finish;
        this.vehicle = vehicle;
    }

    public CarHental(LocalDateTime start, LocalDateTime finish, Vehicle vehicle, Invoice invoice) {
        this.start = start;
        this.finish = finish;
        this.vehicle = vehicle;
        this.invoice = invoice;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getFinish() {
        return finish;
    }

    public void setFinish(LocalDateTime finish) {
        this.finish = finish;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FATURA:");
        sb.append("\n").append("Pagamento basico: R$" +this.invoice.getBasicPayment());
        sb.append("\n").append("Imposto: R$" +this.invoice.getTax());
        sb.append("\n").append("Pagamento Total: R$" +this.invoice.getTotalPayment());
        return sb.toString();
    }
}
