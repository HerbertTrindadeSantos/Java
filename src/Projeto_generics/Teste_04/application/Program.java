package Projeto_generics.Teste_04.application;

import Projeto_generics.Teste_04.entities.Par;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        HashSet<Par<Integer,Double>> parValues = new HashSet<>();
        System.out.print("Digite a quantidade de cargos a adicionar: ");
        int qtdValues = sc.nextInt();
        sc.nextLine();
        for (int i = 0;i < qtdValues;i++){
            System.out.print("Digite o id do cargo:");
            int nameWork = sc.nextInt();
            System.out.print("Digito o valor do salario: ");
            double salary = sc.nextDouble();
            parValues.add(new Par<>(nameWork,salary));
        }

        for (Par<Integer,Double> p : parValues){
            System.out.println(p);
        }

        sc.close();
    }
}
