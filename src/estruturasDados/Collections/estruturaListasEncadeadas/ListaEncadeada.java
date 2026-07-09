package estruturasDados.Collections.estruturaListasEncadeadas;

public class ListaEncadeada<T> {

    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho;

    public void adiciona(T elemento) {
        No<T> celula = new No<>(elemento);
        if (this.tamanho == 0) {
            this.inicio = celula;
        } else {
            this.ultimo.setProximo(celula);
        }
        this.ultimo = celula;
        this.tamanho++;
    }


    public int getTamanho() {
        return this.tamanho;
    }


    public String imprimir() {
        if (this.tamanho == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        No<T> atual = this.inicio;
        sb.append(atual.getElemento());
        while (atual.getProximo() != null) {
            atual = atual.getProximo();
            sb.append(",").append(atual.getElemento());
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public String toString() {
        if (this.tamanho == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        No<T> atual = this.inicio;
        for (int i = 0; i < this.tamanho - 1; i++) {
            sb.append(atual.getElemento()).append(",");
            atual = atual.getProximo();
        }
        sb.append(atual.getElemento()).append("}");
        return sb.toString();
    }
}
