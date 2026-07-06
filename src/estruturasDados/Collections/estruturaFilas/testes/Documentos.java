package estruturasDados.Collections.estruturaFilas.testes;

public class Documentos implements Comparable<Documentos> {

    private String name;
    private int qtdFolhasImpressas;

    public Documentos(String name, int qtdFolhasImpressas) {
        this.name = name;
        this.qtdFolhasImpressas = qtdFolhasImpressas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQtdFolhasImpressas() {
        return qtdFolhasImpressas;
    }

    public void setQtdFolhasImpressas(int qtdFolhasImpressas) {
        this.qtdFolhasImpressas = qtdFolhasImpressas;
    }

    @Override
    public int compareTo(Documentos o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Documentos{" +
                "name='" + name + '\'' +
                ", qtdFolhasImpressas=" + qtdFolhasImpressas +
                '}';
    }
}
