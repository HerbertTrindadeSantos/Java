package Projeto_POO.projeto_01.model.services;

public interface Taxable {

    Double getTaxRate();

     default Double taxAmount(double salary){
        return salary * getTaxRate();
     }
}

