package intermediario.Projetos_Arquivos.Testes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Teste05 {
    public static void main(String[] args) {
        String[] lines = new String[]{"Ola, Bom dia!", "Tudo bem?", "O que está precisando?","Digite sua duvida"};
        String path = "c:\\users\\Herbert\\Documents\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Leitura finalizada.");
        }
    }
}
