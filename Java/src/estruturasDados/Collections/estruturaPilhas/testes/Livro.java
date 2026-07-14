package estruturasDados.Collections.estruturaPilhas.testes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Livro {

    private final static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private String nome;
    private int isbn;
    private LocalDate ano;
    private String autor;

    public Livro(String nome, int isbn, LocalDate ano, String autor) {
        this.nome = nome;
        this.isbn = isbn;
        this.ano = ano;
        this.autor = autor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public LocalDate getAno() {
        return ano;
    }

    public void setAno(LocalDate ano) {
        this.ano = ano;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", isbn='" + isbn + '\'' +
                ", ano=" + ano.format(fmt) +
                ", autor='" + autor + '\'' +
                '}';
    }
}
