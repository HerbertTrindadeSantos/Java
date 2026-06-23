package estruturasDados.Collections.estruturaPilhas.testes;

import java.util.Deque;
import java.util.Stack;

public class teste05 {
    public static void main(String[] args) {
        Stack<Integer> numeros = new Stack<>();
        Stack<Integer> numeros2 = new Stack<>();
        numeros.push(1);
        numeros.push(2);
        System.out.println(numeros.empty());
        System.out.println(numeros2.empty());

        System.out.println(numeros.peek());
        System.out.println(numeros);
        System.out.println(numeros.pop());
        System.out.println(numeros);

        System.out.println(numeros.size());
    }
}
