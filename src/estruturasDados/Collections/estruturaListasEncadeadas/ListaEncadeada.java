package estruturasDados.Collections.estruturaListasEncadeadas;

import java.util.NoSuchElementException;

public class ListaEncadeada<T> {

    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho;

    private final int ELEMENTO_NAO_ENCONTRADO = -1;

    private void adicionaInicio(T elemento) {
        No<T> novoNo = new No<>(elemento);
        if (this.tamanho == 0) {
            this.inicio = novoNo;
            this.ultimo = novoNo;
        } else {
            novoNo.setProximo(this.inicio);
            this.inicio = novoNo;
        }
        this.tamanho++;
    }

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

    public void adiciona(int pos, T elemento) {
        if (this.posicaoNaoExiste(pos)) {
            throw new IllegalArgumentException("Posicao invalida");
        }
        if (pos == 0) {
            this.adicionaInicio(elemento);
        } else if (this.tamanho == pos) {
            this.adiciona(elemento);
        } else {
            No<T> novoNo = new No<>(elemento, this.buscaNo(pos));
            this.buscaNo(pos - 1).setProximo(novoNo);
            this.tamanho++;
        }
    }

    public T removerPrimeiroElemento() {
        if (this.inicio == null || this.tamanho == 0) {
            throw new NoSuchElementException("Nao existe elemento");
        }
        T elementoRemovido = this.inicio.getElemento();
        this.inicio = this.inicio.getProximo();
        this.tamanho--;
        if (this.tamanho == 0) {
            this.ultimo = null;
        }
        return elementoRemovido;
    }

    public T removerUltimoElemento() {
        if (this.tamanho == 0) {
            throw new NoSuchElementException("Lista Vazia");
        }
        if (this.tamanho == 1) {
            return this.removerPrimeiroElemento();
        }
        No<T> penultimoElemento = buscaNo(this.tamanho - 2);
        T ultimoElemento = this.ultimo.getElemento();
        penultimoElemento.setProximo(null);
        this.ultimo = penultimoElemento;
        this.tamanho--;
        return ultimoElemento;
    }

    public T remover(int pos) {
        if (this.posicaoNaoExiste(pos)) {
            throw new IllegalArgumentException("Posicao invalida");
        }
        if (pos == this.tamanho - 1) {
             return this.removerUltimoElemento();
        } else if (pos == 0) {
             return this.removerPrimeiroElemento();
        } else {
           No<T> anterior = buscaNo(pos-1);
           No<T> atual = anterior.getProximo();
           No<T> proximo = atual.getProximo();
           anterior.setProximo(proximo);
           atual.setProximo(null);
           this.tamanho--;
           return  atual.getElemento();
        }
    }

    private boolean posicaoNaoExiste(int pos){
        return (!(pos >= 0 || pos < this.tamanho));
    }

    public int getTamanho() {
        return this.tamanho;
    }

    private No<T> buscaNo(int pos) {
        if (this.posicaoNaoExiste(pos)) {
            throw new NoSuchElementException("Nao há elementos para retirar");
        }
        No<T> atual = this.inicio;
        for (int i = 0; i < pos; i++) {
            atual = atual.getProximo();
        }
        return atual;
    }

    public T buscaElemento(int pos) {
        return this.buscaNo(pos).getElemento();
    }

    public int buscaPosicao(T elemento) {
        No<T> atual = this.inicio;
        int cont = 0;
        while (atual != null) {
            if (atual.getElemento().equals(elemento)) {
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
