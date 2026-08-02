package Programacaofuncional.function.exe_01_1;

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

        List<String> name = productList.stream().map(Product::nonStaticChangeUpperCase).collect(Collectors.toList());
        List<String> name1 = productList.stream().map(Product::staticChangeUpperCase).collect(Collectors.toList());

        name.forEach(System.out::println);
        System.out.println();
        name1.forEach(System.out::println);


    }
}
