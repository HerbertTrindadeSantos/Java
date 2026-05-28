package Projeto_POO.projeto_02.model.entities;

import Projeto_POO.projeto_02.model.interfaces.Shippable;
import Projeto_POO.projeto_02.model.interfaces.Taxable;

public class ImportedProduct extends PhysicalProduct implements Taxable, Shippable {

    public ImportedProduct(String name, Double price, Double weight, Double dimension) {
        super(name, price, weight, dimension);
    }

    @Override
    public double totalValue() {
        return getPrice() + calculateShipping() + calculateTax();
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.10;
    }

    @Override
    public double calculateShipping() {
        return getDimension() * getWeight() * 0.05;
    }
}

