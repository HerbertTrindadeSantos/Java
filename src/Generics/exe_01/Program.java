package Generics.exe_01;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many values: ");
        int qtdValues = sc.nextInt();
        PrintService<String> ps =  new PrintService<>();

        sc.nextLine();
        for (int i = 0; i < qtdValues; i++) {
            System.out.print("Digite o nome:");
            String names = sc.nextLine();
            ps.addValue(names);
        }

        ps.print();





        sc.close();
    }
}
