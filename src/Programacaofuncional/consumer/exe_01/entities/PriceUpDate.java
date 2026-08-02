package Programacaofuncional.consumer.exe_01.entities;

import java.util.function.Consumer;

public class PriceUpDate implements Consumer<Product> {

    @Override
    public void accept(Product p) {
        p.setPrice(p.getPrice() * 1.10);
    }
}
