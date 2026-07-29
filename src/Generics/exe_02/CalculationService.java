package Generics.exe_02;

import java.util.List;

public class CalculationService {

    public static <T extends Comparable<? super T>> T max(List<T> list){
        T max = list.get(0);
        for (T item : list){
            if (item.compareTo(max) > 0){
                max = item;
            }
        }
        return max;
    }
}
