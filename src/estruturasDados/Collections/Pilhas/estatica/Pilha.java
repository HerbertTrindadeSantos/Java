package estruturasDados.Collections.Pilhas.estatica;

import estruturasDados.Collections.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {

    private T[] elementos;
    private int capacidade;

    public Pilha() {
        super();
    }

    public Pilha(int capacidade) {
        super(capacidade);
    }

    public void empilhar(T elemento){
       super.adiciona(elemento);
    }

    public T  desempilhar(){
        this.capacidade--;
        return this.elementos[this.capacidade-1];
    }






}
