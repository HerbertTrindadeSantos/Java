package estruturasDados.Collections.Vetor.Lista;

public class Lista<T> {

    private T[] elementos;
    private int capacidade;

    public Lista() {
        this.elementos = (T[]) new Object[10];
        this.capacidade = 0;
    }

    public Lista(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.capacidade = 0;
    }

    public void aumentaCapacidade() {
        if (this.capacidade == this.elementos.length) {
            T[] novoVetor = (T[]) new Object[this.elementos.length * 2];
            for (int i = 0; i < this.capacidade; i++) {
                novoVetor[i] = this.elementos[i];
            }
            this.elementos = novoVetor;
        }
    }

    public T obtem(int index){
        if (!(index >= 0 && this.capacidade > index)){
            throw new IllegalArgumentException("Posicao invalida");
        }
        return this.elementos[index];
    }

    public void adicionar(T elemento) {
        aumentaCapacidade();
        if (!(this.elementos.length > this.capacidade)) {
            throw new ArrayIndexOutOfBoundsException("Não há espaco no vetor");
        }
        this.elementos[capacidade] = elemento;
        this.capacidade++;
    }

    public boolean adicionar(T elemento, int index) {
        if (!(this.capacidade > index && index >= 0)) {
            throw new IllegalArgumentException("Posição invalida.");
        }
        aumentaCapacidade();
        for (int i = this.capacidade - 1; i >= index; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[index] = elemento;
        this.capacidade++;
        return false;
    }

    public void remover(int index) {
        if (!(this.capacidade > index && index >= 0)) {
            throw new IllegalArgumentException("Posição invalida.");
        }
        for (int i = index; i < this.capacidade - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }
        this.capacidade--;
    }

    public void remover(T elemento) {
        int pos = this.posicao(elemento);
        if (pos > -1) {
            remover(pos);
        }
    }

    public void limpar(){
        for (int i = 0; i < this.capacidade; i++) {
            this.elementos[i] = null;
        }
        this.capacidade = 0;
    }

    public Boolean contem(T elemento) {
        if (posicao(elemento) >= 0) {
            return true;
        }
        return false;
    }

    public int tamanho() {
        return this.capacidade;
    }

    public int posicao(T elemento) {
        for (int i = 0; i < this.capacidade; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public T busca(int index) {
        if (!(index < this.capacidade && index >= 0)) {
            throw new IllegalArgumentException("Posição invalida.");
        }
        return this.elementos[index];
    }

    public int ultimaOcorrencia(T elemento) {
        for (int i = this.capacidade - 1; i >= 0; i--) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
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
        if (this.capacidade == 0){
            sb.append("]");
        }
        return sb.toString();
    }
}

