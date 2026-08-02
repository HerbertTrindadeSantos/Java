package Programacaofuncional.function.exe_01;

import Programacaofuncional.function.exe_01.entities.Product;
import Programacaofuncional.function.exe_01.entities.changeUpperCase;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();

        productList.add(new Product("Car",40000.00));
        productList.add(new Product("Bike",200.00));
        productList.add(new Product("Mouse",85.00));

        List<String> newList = productList.stream().map(new changeUpperCase()).collect(Collectors.toList());

        newList.forEach(System.out::println);


    }
}
