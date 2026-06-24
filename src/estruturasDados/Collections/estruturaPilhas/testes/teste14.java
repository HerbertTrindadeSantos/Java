package estruturasDados.Collections.estruturaPilhas.testes;



import java.util.Stack;

public class teste14 {
    public static void main(String[] args) {
        int numero = 10035;
        System.out.println(conversaoBinario(numero));
    }

    public static long conversaoBinario(int numero){
        Stack<Integer> binarios = new Stack<>();
        long binario = 0;
        while (numero > 0){
            binarios.push(numero%2);
            numero = numero / 2;
        }
        while (!binarios.empty()){
            binario = binarios.pop() + 10 * binario;
        }
        return binario;
    }
}
