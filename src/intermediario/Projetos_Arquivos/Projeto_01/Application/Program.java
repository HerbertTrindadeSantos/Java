package intermediario.Projetos_Arquivos.Projeto_01.Application;

import intermediario.Projetos_Arquivos.Projeto_01.Entities.Product;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("#####CADASTRO DE PRODUTOS#####");
        System.out.print("Quantidade de produtos para o cadastro:");
        int qtdCdProduct = sc.nextInt();


        Product[] products = new Product[qtdCdProduct];

        for (int i = 0; i < qtdCdProduct;i++){
            System.out.print("Produto #"+(i+1)+":");
            sc.nextLine();
            String nameProduct = sc.nextLine();
            System.out.print("Quantidade:");
            int qtdProduct = sc.nextInt();
            sc.nextLine();
            System.out.print("Valor R$:");
            double valueProduct = sc.nextDouble();
            products[i] = new Product(nameProduct,qtdProduct,valueProduct);
            System.out.println("------------------------------");
        }
        sc.nextLine();
        System.out.print("Digite o caminho do arquivo:");
        String strPath = sc.nextLine();

        File file = new File(strPath);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
            for (Product pd : products){
                bw.write(pd.toString());
                bw.newLine();
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
