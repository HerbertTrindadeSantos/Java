package Projeto_generics.Teste_02.application;


import Projeto_generics.Teste_02.entities.Product;
import Projeto_generics.Teste_02.services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        String strFile = "/home/herbert/Documentos/out/values.csv";

        List<Product> products = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(strFile))){
            String values = br.readLine();
            while (values != null){
                String[] fields = values.split(",");
                products.add(new Product(fields[0],Double.parseDouble(fields[1])));
                values = br.readLine();
            }
            Product x = CalculationService.max(products);
            System.out.println(x);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
