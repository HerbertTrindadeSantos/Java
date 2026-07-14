package introducao.Projeto_POO.projeto_02.model.entities;

import introducao.Projeto_POO.projeto_02.model.interfaces.Taxable;

import java.time.LocalDate;

public class DigitalProduct extends Product implements Taxable {

    private String link;
    private LocalDate dateExpiration;

    public DigitalProduct(String link, LocalDate dateExpiration) {
        this.link = link;
        this.dateExpiration = dateExpiration;
    }

    public DigitalProduct(String name, Double price, String link, LocalDate dateExpiration) {
        super(name, price);
        this.link = link;
        this.dateExpiration = dateExpiration;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public LocalDate getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(LocalDate dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    @Override
    public double totalValue() {
        return getPrice() + calculateTax();
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.05;
    }

}
