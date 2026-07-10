package estruturasDados.Collections.estruturaListasEncadeadas;

public class ListaEncadeada<T> {

    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho;

    private final int ELEMENTO_NAO_ENCONTRADO = -1;

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

    private No<T> buscaPosicaoNo(int pos){
        if (pos < 0 || pos > this.tamanho){
            throw new IllegalArgumentException("Posição inválida");
        }
        No<T> atual = this.inicio;
        for (int i = 0; i < pos; i++) {
            atual = atual.getProximo();
        }
        return atual;
    }

    public T buscaElemento(int pos){
        return this.buscaPosicaoNo(pos).getElemento();
    }
    public int buscaPosicao(T elemento){
        No<T> atual = this.inicio;
        int cont = 0;
        while(atual != null){
            if (atual.getElemento().equals(elemento)){
                return cont;
            }
            cont++;
            atual = atual.getProximo();
        }
        return ELEMENTO_NAO_ENCONTRADO;
    }



    public void limpa() {
        for (No<T> atual = this.inicio; atual != null; ) {
            No<T> proximo = atual.getProximo();
            atual.setElemento(null);
            atual.setProximo(null);
            atual = proximo;
        }

        this.inicio = null;
        this.ultimo = null;
        this.tamanho = 0;
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
