package estruturasDados.Collections.estruturaListasEncadeadas;

public class ListaEncadeada<T> {

    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho;

    public void adiciona(T elemento){
       No<T> celula = new No<>(elemento);
       if (this.tamanho == 0){
           this.inicio = celula;
       }else {

       }
        this.ultimo = celula;
        this.tamanho++;
    }

    public void adicionar(T elemento){
        No<T> celula = new No<>(this.inicio.getElemento(),new No<>(elemento));
        this.tamanho++;
    }


    public int getTamanho(){
        return this.tamanho;
    }



    @Override
    public String toString() {
        return "ListaEncadeada{" +
                "inicio=" + inicio +
                '}';
    }
}
