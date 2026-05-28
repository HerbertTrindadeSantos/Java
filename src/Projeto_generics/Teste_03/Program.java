package Projeto_generics.Teste_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Program {
    public static void main(String[] args) {
        List<Integer> numInt  = List.of(1,2,3,4);
        List<Object> obj = new ArrayList<>();
        List<Double> numDouble = List.of(1.5,6.5,8.6);

        copyList(numInt,obj);
        printList(obj);
        copyList(numDouble,obj);
        printList(obj);
    }

    public static void copyList(List<? extends Number>listNumber,List<? super Number>listObj){
        for (Number num : listNumber){
            listObj.add(num);
        }
    }

    public static void printList(List<?>list){
        for (Object obj : list){
            System.out.print(obj+ " ");
        }
        System.out.println();
    }
}
