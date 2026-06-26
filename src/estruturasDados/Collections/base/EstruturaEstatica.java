package estruturasDados.Collections.base;

public class EstruturaEstatica<T> {

    protected T[] elementos;
    protected int capacidade;

    public EstruturaEstatica() {
        this.elementos = (T[]) new Object[10];
    }

    public EstruturaEstatica(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.capacidade = 0;
    }

    public int tamanho() {
        return this.capacidade;
    }

    public void aumentaCapacidade() {
        if (this.elementos.length == this.capacidade) {
            T[] novosElementos = (T[]) new Object[this.capacidade * 2];
            for (int i = 0; i < this.capacidade; i++) {
                novosElementos[i] = this.elementos[i];
            }
            this.elementos = novosElementos;
        }
    }

    public void adiciona(T elemento) {
        aumentaCapacidade();
        if (this.elementos.length > this.capacidade) {
            this.elementos[this.capacidade] = elemento;
        }
        this.capacidade++;
    }

    protected boolean adiciona(T elemento, int index) {
        if (!(this.capacidade > index && index >= 0)) {
            throw new IllegalArgumentException("Posicao invalida");
        }
        aumentaCapacidade();
        for (int i = this.capacidade - 1; i >= index; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[index] = elemento;
        this.capacidade++;
        return false;
    }

    protected void remove(int index) {
        if (!(this.capacidade > index && index >= 0)) {
            throw new IllegalArgumentException("Posicao invalida");
        }
        for (int i = index; i < this.capacidade - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }
        this.capacidade--;
    }

    public boolean estaVazia() {
        return this.capacidade == 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < this.capacidade - 1; i++) {
            sb.append(this.elementos[i]).append(", ");
        }
        if (this.capacidade > 0) {
            sb.append(this.elementos[this.capacidade - 1]).append("]");
        }
        if (this.capacidade == 0) {
            sb.append("]");
        }
        return sb.toString();
    }
}
