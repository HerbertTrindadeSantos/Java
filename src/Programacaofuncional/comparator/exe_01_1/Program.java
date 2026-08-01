package Programacaofuncional.comparator.exe_01_1;

import Programacaofuncional.comparator.exe_01_3.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Product> listProducts = new ArrayList<>();

        listProducts.add(new Product("Televisao",4500.00));
        listProducts.add(new Product("Celular",3000.00));
        listProducts.add(new Product("Notebook",8000.00));

        listProducts.sort(new MyComparator());

        for (Product p : listProducts){
            System.out.println(p);
        }

    }
}
