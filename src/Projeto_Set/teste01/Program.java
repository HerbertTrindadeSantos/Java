package Projeto_Set.teste01;

import java.util.*;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("===Lista===");
        List<String> names = List.of("Ana","Bruno","Ana","Carlos","Bruno");
        for (String nm : names){
            System.out.println(nm);
        }
        System.out.println();
        System.out.println("===Lista HashSet===");
        HashSet<String> namesHashSet = new HashSet<>(names);
        for (String nm : namesHashSet){
            System.out.println(nm);
        }
        System.out.println();
        System.out.println("===Lista TreeSet===");
        TreeSet<String> namesTreeSet = new TreeSet<>(namesHashSet);
        for (String nm : namesTreeSet){
            System.out.println(nm);
        }





        sc.close();
    }
}
