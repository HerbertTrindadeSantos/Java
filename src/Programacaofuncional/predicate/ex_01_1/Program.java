package Programacaofuncional.predicate.ex_01_1;



import Programacaofuncional.predicate.ex_01_1.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Tv",900.00));
        productList.add(new Product("Mouse",50.00));
        productList.add(new Product("Tablet",350.50));
        productList.add(new Product("HD Case",80.90));

        productList.removeIf(Product::noStaticProductPredicate);

        for (Product p : productList){
            System.out.println(p);
        }
    }
}
