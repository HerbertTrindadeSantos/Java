package Generics.exe_04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(4.0, 5.7, 9.8, 6.5);
        List<Object> myObjects = new ArrayList<>();

        System.out.println(myInts);
        copy(myInts,myObjects);
        System.out.println(myObjects);

        System.out.println();

        System.out.println(myDoubles);
        copy(myDoubles,myObjects);
        System.out.println(myObjects);



    }

    public static void copy(List<? extends Number> list, List<? super Number> newList){

        for (int i = 0; i < list.size(); i++) {
            Number x = list.get(i);
            newList.add(x);
        }
    }
}
