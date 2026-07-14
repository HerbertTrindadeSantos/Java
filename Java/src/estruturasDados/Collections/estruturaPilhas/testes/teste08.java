package estruturasDados.Collections.estruturaPilhas.testes;

import estruturasDados.Collections.estruturaPilhas.Pilha;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class teste08 {
    public static void main(String[] args) {

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Pilha<Livro> livrosPilha = new Pilha<>(20);
        livrosPilha.empilhar(new Livro("Pinoquio",123, LocalDate.parse("12/09/2003",fmt),"Felipe Jhon"));
        livrosPilha.empilhar(new Livro("Bela e a Fera",321, LocalDate.parse("12/12/2015",fmt),"Terrency"));
        livrosPilha.empilhar(new Livro("Mindset",301, LocalDate.parse("02/02/2013",fmt),"Cristian"));
        livrosPilha.empilhar(new Livro("Como fazer amigos",301, LocalDate.parse("05/05/2015",fmt),"Izabel"));
        livrosPilha.empilhar(new Livro("Como ficar rico",201, LocalDate.parse("21/05/2015",fmt),"Izabela"));
        livrosPilha.empilhar(new Livro("O homem mais rico da babilonia",450, LocalDate.parse("30/06/2012",fmt),"Felipa"));
        System.out.println(livrosPilha);
        System.out.println(livrosPilha.topo());
        System.out.println(livrosPilha.tamanho());
        System.out.println(livrosPilha.desempilhar());
        System.out.println(livrosPilha.desempilhar());
        System.out.println(livrosPilha.desempilhar());
        System.out.println(livrosPilha.desempilhar());
        System.out.println(livrosPilha.desempilhar());
        System.out.println(livrosPilha.tamanho());
        System.out.println(livrosPilha.topo());


    }
}

