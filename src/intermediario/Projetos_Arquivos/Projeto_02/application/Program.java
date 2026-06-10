package intermediario.Projetos_Arquivos.Projeto_02.application;



import intermediario.Projetos_Arquivos.Projeto_02.Entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o caminho do arquivo:");
        String strFile = sc.nextLine();

        File file = new File(strFile);

        List<Product> products = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(strFile))) {
            String line = br.readLine();
            while (line != null) {
                String[] items = line.split(",");
                String name = items[0];
                double value = Double.parseDouble(items[1]);
                int qtd = Integer.parseInt(items[2]);
                products.add(new Product(name,value,qtd));
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        String parentPath = file.getParent();
        boolean isCreatPath = new File( parentPath + "/out").mkdir();
        System.out.println(isCreatPath);
        String fileCsv = parentPath + "/out/summary.csv";
        System.out.println(fileCsv);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileCsv))){
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
