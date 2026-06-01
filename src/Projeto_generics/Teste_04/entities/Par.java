package Projeto_generics.Teste_04.entities;

import java.util.Objects;

public class Par<T, U> {

    private T name;
    private U price;

    public Par(T name, U price) {
        this.name = name;
        this.price = price;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public U getPrice() {
        return price;
    }

    public void setPrice(U price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Par<?, ?> par = (Par<?, ?>) o;
        return Objects.equals(name, par.name) && Objects.equals(price, par.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "Par{" +
                "name=" + name +
                ", price=" + price +
                '}';
    }
}
