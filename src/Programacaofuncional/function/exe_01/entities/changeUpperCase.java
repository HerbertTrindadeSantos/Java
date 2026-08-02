package Programacaofuncional.function.exe_01.entities;

import java.util.function.Function;

public class changeUpperCase implements Function<Product,String> {

    @Override
    public String apply(Product p) {
        return p.getName().toUpperCase();
    }
}
