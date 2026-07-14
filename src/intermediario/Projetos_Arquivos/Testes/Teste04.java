package intermediario.Projetos_Arquivos.Testes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Teste04 {
    public static void main(String[] args) {
        String[] lines = new String[]{"Ola, Bom dia!", "Tudo bem?", "O que está precisando?"};
        String path = "c:\\users\\Herbert\\Documents\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
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
