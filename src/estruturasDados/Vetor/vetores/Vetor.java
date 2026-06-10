package estruturasDados.Vetor.vetores;

public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public void aumentaTamanho() {
        if (this.tamanho == this.elementos.length) {
            String[] elementosNovos = new String[this.tamanho * 2];
            for (int i = 0; i < tamanho; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public void adiciona(String elemento) throws IllegalStateException {
        this.aumentaTamanho();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new IllegalStateException("Nao existe essa posicao no vetor");
        }
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public int buscaNome(String elemento) throws IllegalArgumentException {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        throw new IllegalArgumentException("Nao tem esse elemento no vetor");
    }

    public String buscaPosicao(int index) {
        if (!(this.tamanho >= 0 && this.tamanho > index)) {
            throw new IllegalArgumentException("Posicao invalida");
        }
        return this.elementos[index];
    }

    public void insereElementos(String elemento, int index) throws IllegalArgumentException {
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
        if (!(this.tamanho > index & this.tamanho >= 0)){
            throw new IllegalArgumentException("Posicao invalida");
        }
        for (int i = index; i < this.tamanho - 1; i++) {
            this.elementos[i] = elementos[i+1];
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
