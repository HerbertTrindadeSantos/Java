package intermediario.Projetos_Arquivos.Testes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Teste03 {
    public static void main(String[] args) {
        File file = new File("c:\\users\\Herbert\\Documents\\in.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Leitura finalizada");
        }
    }
}
