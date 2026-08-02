package Programacaofuncional.consumer.exe_01_2;

import Programacaofuncional.consumer.exe_01.entities.Product;

import java.util.*;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Product> listProducts = new ArrayList<>();

        listProducts.add(new Product("TV",900.00));
        listProducts.add(new Product("Mouse",50.00));
        listProducts.add(new Product("Tablet",350.50));
        listProducts.add(new Product("HD Case",80.90));

        double factor = 1.1;

        listProducts.forEach(p -> p.setPrice(p.getPrice() * factor));

        listProducts.forEach(System.out::println);

    }
}
