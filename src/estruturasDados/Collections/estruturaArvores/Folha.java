package estruturasDados.Collections.estruturaArvores;

public class Folha {

    private int valor;


    public Folha(int valor){
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Folha{" +
                "valor=" + valor +
                '}';
    }
}
