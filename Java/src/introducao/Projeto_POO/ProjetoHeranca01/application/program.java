package introducao.Projeto_POO.ProjetoHeranca01.application;

import introducao.Projeto_POO.ProjetoHeranca01.entities.ImportedProduct;
import introducao.Projeto_POO.ProjetoHeranca01.entities.Product;
import introducao.Projeto_POO.ProjetoHeranca01.entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Digite a quantidade de produtos:");
        int quantityProduct = sc.nextInt();
        List<Product> products = new ArrayList<>();
        for (int i = 0; i < quantityProduct; i++) {
            System.out.println("Dados do Produto #" + (i + 1) + ":");
            System.out.print("Comum,usado ou importado (c/u/i):");
            char choiceSetypeProduct = sc.next().charAt(0);
            System.out.print("Nome:");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Preco:");
            Double price = sc.nextDouble();
            if (choiceSetypeProduct == 'u') {
                System.out.print("Data de fabricacao: (DD/MM/YYYY)");
                LocalDate dateManufacture = LocalDate.parse(sc.next(), fmt);
                Product usedProduct = new UsedProduct(name,price,dateManufacture);
                products.add(usedProduct);
            } else if (choiceSetypeProduct == 'i') {
                System.out.print("Taxa de importacao: R$");
                double customFee = sc.nextDouble();
                Product importedProduct = new ImportedProduct(name,price,customFee);
                products.add(importedProduct);
            }else{
                Product commonProduct = new Product(name,price);
                products.add(commonProduct);
            }
        }
        System.out.println("-------------------");
        for (Product pd : products){
            System.out.println(pd.priceTag());
        }


        sc.close();
    }
}
