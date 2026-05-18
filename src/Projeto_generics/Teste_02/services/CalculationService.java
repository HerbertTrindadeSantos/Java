package Projeto_generics.Teste_02.services;

import java.util.List;

public class CalculationService {

    public static <T extends Comparable<? super T>> T max(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalStateException("Lista nao pode ser vazia");
        }
        T max = list.get(0);
        for (T item : list) {
            if (item.compareTo(max) > 0){
                max = item;
            }
        }
        return max;
    }
}
