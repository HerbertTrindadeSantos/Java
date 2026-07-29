package Generics.exe_02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        File file = new File("/home/herbert/Documentos/out/in1.txt");

        List<Product> productList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                productList.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException("erro ao execurtar arquivo.");
        }
        System.out.println(CalculationService.max(productList));
    }
}
