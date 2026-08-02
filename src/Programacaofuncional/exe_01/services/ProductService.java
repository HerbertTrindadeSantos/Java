package Programacaofuncional.exe_01.services;

import Programacaofuncional.exe_01.entities.Product;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {

    public double filteredSum(List<Product> list, Predicate<Product> criteria){
        double sum = 0.0;
        for (Product p : list){
            if (criteria.test(p)){
                sum += p.getValue();
            }
        }
        return sum;
    }
}
