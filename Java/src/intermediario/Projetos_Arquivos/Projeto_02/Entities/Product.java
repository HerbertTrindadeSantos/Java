package intermediario.Projetos_Arquivos.Projeto_02.Entities;

public class Product {
    private String name;
    private double value;
    private int quantity;

    public Product(String name,double value, int quantity) {
        this.name = name;
        this.value = value;
        this.quantity = quantity;
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

    public double totalValue(){
        return this.quantity * this.value;
    }

    @Override
    public String toString() {
        return this.name
                +","
                +totalValue();
    }
}
