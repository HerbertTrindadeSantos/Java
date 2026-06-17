package estruturasDados.Vetor.Lista;

public class Lista<T> {

    private T[] elementos;
    private int tamanho;

    public Lista() {
        this.elementos = (T[]) new Object[10];
        this.tamanho = 10;
    }

    public Lista(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public void aumentaTamanho() {
        if (this.tamanho == this.elementos.length) {
            Object[] elementosNovos = new Object[this.tamanho * 2];
            for (int i = 0; i < tamanho; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = (T[]) elementosNovos;
        }
    }

    public void adiciona(T elemento) throws IllegalStateException {
        this.aumentaTamanho();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new IllegalStateException("Nao existe essa posicao no vetor");
        }
    }

    public boolean contem(T elemento) {
        if (buscaNome(elemento) >= 0) {
            return true;
        }
        return false;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public int buscaNome(T elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public Object buscaPosicao(int index) {
        if (!(this.tamanho >= 0 && this.tamanho > index)) {
            throw new IllegalArgumentException("Posicao invalida");
        }
        return this.elementos[index];
    }

    public int BuscaUltimaPosicaoElemento(T elemento) {
        int pos = 0;
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                pos = i;
            }
        }
        if (pos > 0){
            return pos;
        }
        return -1;
    }

    public void insereElementos(T elemento, int index) throws IllegalArgumentException {
        if (!(this.tamanho >= 0 && this.tamanho > index)) {
            throw new IllegalArgumentException("Posicao invalida");
        }
        this.aumentaTamanho();
        for (int i = this.tamanho - 1; i >= index; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        this.tamanho++;
        this.elementos[index] = elemento;
    }

    public void removeElementos(int index) throws IllegalArgumentException {
        if (!(this.tamanho > index & this.tamanho >= 0)) {
            throw new IllegalArgumentException("Posicao invalida");
        }
        for (int i = index; i < this.tamanho - 1; i++) {
            this.elementos[i] = elementos[i + 1];
        }
        this.tamanho--;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < this.tamanho - 1; i++) {
            sb.append(this.elementos[i]);
            sb.append(",");
        }
        if (this.tamanho - 1 > 0) {
            sb.append(this.elementos[tamanho - 1]);
            sb.append("]");
        }
        return sb.toString();
    }
}


