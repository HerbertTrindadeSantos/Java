package Projeto_Interfaces.TesteComparable_01.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de produtos:");
        int qtdProducts = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < qtdProducts; i++) {

        }


        sc.close();
    }
}
