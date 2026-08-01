package Programacaofuncional.predicate.ex_01;

import Programacaofuncional.comparator.exe_01_3.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Tv",900.00));
        productList.add(new Product("Mouse",50.00));
        productList.add(new Product("Tablet",350.50));
        productList.add(new Product("HD Case",80.90));

        productList.removeIf(p -> p.getPrice() >= 100);

        for (Product p : productList){
            System.out.println(p);
        }
    }
}
