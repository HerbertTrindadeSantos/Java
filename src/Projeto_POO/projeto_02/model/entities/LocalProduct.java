package Projeto_POO.projeto_02.model.entities;

import Projeto_POO.projeto_02.model.interfaces.Shippable;

public class LocalProduct extends PhysicalProduct implements Shippable {

    public LocalProduct(String name, Double price, Double weight, Double dimension) {
        super(name, price, weight, dimension);
    }

    @Override
    public double totalValue() {
       return getPrice() + calculateShipping();
    }

    @Override
    public double calculateShipping() {
        return getDimension() * getWeight() * 0.08;
    }
}
