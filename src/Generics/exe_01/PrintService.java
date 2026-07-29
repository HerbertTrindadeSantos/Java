package Generics.exe_01;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {


    private List<T> fiels = new ArrayList<>();

    public void addValue(T value){
        fiels.add(value);
    }

    public T first(){
        return fiels.get(0);
    }

    public void print(){
        for (int i = 0; i < fiels.size(); i++) {
            System.out.println(fiels.get(i));
        }
    }
}
