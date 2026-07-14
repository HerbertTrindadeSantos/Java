package introducao.Projeto_POO.ProjetoHeranca01.entities;

public class ImportedProduct extends Product {

    private Double customsFee;

    public ImportedProduct() {
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    @Override
    public String priceTag() {
        return super.priceTag()
                + "+Taxa de importacao: R$"
                + customsFee
                +" - Valor total: R$"+totalPrice();
    }

    public Double totalPrice() {
        return getPrice() + customsFee;
    }
}
