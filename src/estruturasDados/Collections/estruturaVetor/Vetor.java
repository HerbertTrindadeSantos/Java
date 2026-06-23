package estruturasDados.Collections.estruturaVetor;


public class Vetor {
    private Object[] elementos;
    private int capacidade;

    public Vetor(int capacidade) {
        this.elementos = new Object[capacidade];
        this.capacidade = 0;
    }

    public void aumentaCapacidade() {
        if (this.capacidade == this.elementos.length) {
            Object[] novoVetor = new Object[this.elementos.length * 2];
            for (int i = 0; i < this.capacidade; i++) {
                novoVetor[i] = this.elementos[i];
            }
            this.elementos = novoVetor;
        }
    }

    public void adicionar(Object elemento) {
        aumentaCapacidade();
        if (!(this.elementos.length > this.capacidade)) {
            throw new ArrayIndexOutOfBoundsException("Não há espaco no vetor");
        }
        this.elementos[capacidade] = elemento;
        this.capacidade++;
    }

    public boolean adicionar(Object elemento, int index) {
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

    public int tamanho() {
        return this.capacidade;
    }

    public int posicao(Object elemento) {
        for (int i = 0; i < this.capacidade; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        throw new IllegalArgumentException("Não esse elemento no vetor");
    }

    public Object busca(int index) {
        if (!(index < this.capacidade && index >= 0)) {
            throw new IllegalArgumentException("Posição invalida.");
        }
        return this.elementos[index];
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
        return sb.toString();
    }
}
