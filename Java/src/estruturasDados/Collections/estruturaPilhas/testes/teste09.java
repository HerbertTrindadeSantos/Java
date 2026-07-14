package estruturasDados.Collections.estruturaPilhas.testes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Stack;

public class teste09 {
    public static void main(String[] args) {

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Stack<Livro> livroStack = new Stack<Livro>();

        livroStack.push(new Livro("Pinoquio",123, LocalDate.parse("12/09/2003",fmt),"Felipe Jhon"));
        livroStack.push(new Livro("Bela e a Fera",321, LocalDate.parse("12/12/2015",fmt),"Terrency"));
        livroStack.push(new Livro("Mindset",301, LocalDate.parse("02/02/2013",fmt),"Cristian"));
        livroStack.push(new Livro("Como fazer amigos",301, LocalDate.parse("05/05/2015",fmt),"Izabel"));
        livroStack.push(new Livro("Como ficar rico",201, LocalDate.parse("21/05/2015",fmt),"Izabela"));
        livroStack.push(new Livro("O homem mais rico da babilonia",450, LocalDate.parse("30/06/2012",fmt),"Felipa"));
        System.out.println(livroStack);
        System.out.println(livroStack.peek());
        System.out.println(livroStack.size());
        System.out.println(livroStack.pop());
        System.out.println(livroStack.pop());
        System.out.println(livroStack.pop());
        System.out.println(livroStack.pop());
        System.out.println(livroStack.pop());
        System.out.println(livroStack.size());
        System.out.println(livroStack.peek());
    }
}
