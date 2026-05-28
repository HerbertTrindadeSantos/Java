package Projeto_POO.projeto_02.model.interfaces;

public interface Taxable {
    double calculateTax();
    default String taxInfo(){
        return "Taxa: R$"+ String.format("%.2f",calculateTax());
    }
}
