package estruturasDados.Collections.estruturaArvores;

public class Arvore {

    private Folha folha;
    private Arvore esquerda;
    private Arvore direita;

    public Arvore() {
        this.direita = null;
        this.esquerda = null;
        this.folha = null;
    }

    public Arvore(Folha folha) {
        this.folha = folha;
        this.esquerda = null;
        this.direita = null;
    }

    public Arvore(Folha folha, Arvore esquerda, Arvore direita) {
        this.folha = folha;
        this.esquerda = esquerda;
        this.direita = direita;
    }

    public boolean isEmpty() {
        return this.folha == null;
    }

    public void inserir(Folha folha) {
        if (this.isEmpty()) {
            this.folha = folha;
        } else {
            Arvore novaArvore = new Arvore(folha);
            if (this.folha.getValor() > folha.getValor()) {
                if (this.esquerda == null) {
                    this.esquerda = novaArvore;
                } else {
                    this.esquerda.inserir(folha);
                }
            } else if (this.folha.getValor() < folha.getValor()) {
                if (this.direita == null){
                    this.direita = novaArvore;
                }else {
                    this.direita.inserir(folha);
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Arvore{" +
                "folha=" + folha +
                ", esquerda=" + esquerda +
                ", direita=" + direita +
                '}';
    }
}
