package intermediario.Projetos_Arquivos.Projeto_01.Entities;

public class Product {
    private String name;
    private int quantity;
    private double value;

    public Product(String name, int quantity, double value) {
        this.name = name;
        this.quantity = quantity;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double valueTotal(){
        return this.quantity * this.value;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.name).append(",").append(this.value);
        return sb.toString();
    }
}
