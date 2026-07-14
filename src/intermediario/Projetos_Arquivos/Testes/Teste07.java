package intermediario.Projetos_Arquivos.Testes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Teste07 {
    public static void main(String[] args) {
        File file = new File("c:\\users\\Herbert\\Documents\\names.txt");
        List<String> peoples = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String names = br.readLine();
            while (names != null) {
                peoples.add(names);
                System.out.println(names);
                names = br.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();
        Collections.sort(peoples);

        for (String pd : peoples) {
            System.out.println(pd);
        }
    }
}
