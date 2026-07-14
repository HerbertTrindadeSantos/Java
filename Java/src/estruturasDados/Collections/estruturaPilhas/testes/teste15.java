package estruturasDados.Collections.estruturaPilhas.testes;

import java.util.Stack;

public class teste15 {
    public static void main(String[] args) {

        Stack<Integer> inicial = new Stack<>();
        Stack<Integer> destino = new Stack<>();
        Stack<Integer> auxiliar = new Stack<>();

        inicial.push(3);
        inicial.push(2);
        inicial.push(1);
        torreHanoi(inicial.size(),inicial,destino,auxiliar);

    }

    public static void torreHanoi(int argolas,Stack<Integer> inicial,Stack<Integer> destino,Stack<Integer> auxiliar){
        if (argolas > 0){
            torreHanoi(argolas-1,inicial,auxiliar,destino);
            destino.push(inicial.pop());
            torreHanoi(argolas-1,auxiliar,destino,inicial);
        }
    }
}
