package Programacaofuncional.exe_01;

import Programacaofuncional.exe_01.entities.Product;
import Programacaofuncional.exe_01.services.ProductService;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();

        productList.add(new Product("Tv",900.00));
        productList.add(new Product("Mouse",50.00));
        productList.add(new Product("Tablet",350.50));
        productList.add(new Product("HD Case",80.90));

        ProductService ps = new ProductService();

        double valueTotalProdutes = ps.filteredSum(productList,p -> p.getName().charAt(0) == 'T');
        double valueTotalProdutes1 = ps.filteredSum(productList,p -> p.getValue() < 100.00);

        System.out.println(valueTotalProdutes1);
        System.out.println();
        System.out.println(valueTotalProdutes);
    }
}
