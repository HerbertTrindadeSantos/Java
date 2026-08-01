package Programacaofuncional.predicate.exe_01_2;

import Programacaofuncional.predicate.ex_01_1.entities.Product;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {
    @Override
    public boolean test(Product p) {
        return p.getPrice() >= 100;
    }
}
