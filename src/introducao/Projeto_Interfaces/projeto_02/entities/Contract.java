package introducao.Projeto_Interfaces.projeto_02.entities;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Contract {
    private static final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private int number;
    private LocalDate date;
    private double totalValue;

    private List<Installment> installments = new ArrayList<>();

    public Contract(int number, LocalDate date, double totalValue) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
    }

    public List<Installment> getInstallments() {
        return installments;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void addInstallment(Installment installment){
        installments.add(installment);
    }

    public void removeInstallment(Installment installment){
        installments.remove(installment);
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Installment inst : installments){
            sb.append(inst.getDate().format(fmt)).append(" - ").append(inst.getValue());
            sb.append("\n");
        }
        return sb.toString();
    }
}
