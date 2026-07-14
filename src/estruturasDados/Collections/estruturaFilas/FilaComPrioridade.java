package estruturasDados.Collections.estruturaFilas;

public class FilaComPrioridade<T> extends Filas<T> {

    public FilaComPrioridade() {
    }

    public FilaComPrioridade(int capacidade) {
        super(capacidade);
    }


    public void enfileirar(T elemento) {
        Comparable<T> chave = (Comparable<T>) elemento;
        int i ;
        for (i = 0 ; i < this.capacidade; i++) {
            if (chave.compareTo(this.elementos[i]) < 0) {
                break;
            }
        }
        this.adiciona(elemento, i);
    }
}
