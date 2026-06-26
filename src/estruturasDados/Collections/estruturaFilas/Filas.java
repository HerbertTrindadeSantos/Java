package estruturasDados.Collections.estruturaFilas;

import estruturasDados.Collections.base.EstruturaEstatica;

public class Filas<T> extends EstruturaEstatica<T> {

    public Filas() {
        super();
    }

    public Filas(int capacidade) {
        super(capacidade);
    }

    public void enfileirar(T elemento) {
        super.adiciona(elemento);
    }

    public T desenfileirar() {
        if (this.estaVazia()){
            return null;
        }
        super.remove(0);
    }

    public T espiar() {
        if (!(this.capacidade > 0)) {
            throw new IllegalArgumentException("Não há elementos");
        }
        else if (this.estaVazia()) {
            return null;
        }
        return this.elementos[0];
    }
}
