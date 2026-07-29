package Generics.exe_02;

public class Product implements Comparable<Product> {

    private String name;
    private Double value;

    public Product(String name, Double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public int compareTo(Product product) {
        return this.value.compareTo(product.getValue());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name).append(" - ");
        sb.append("R$").append(this.value);
        return sb.toString();
    }
}
