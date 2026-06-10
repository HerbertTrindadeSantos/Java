package intermediario.Projetos_Arquivos.Testes;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Teste01 {
    public static void main(String[] args) {
        File file = new File("c:\\users\\Herbert\\Documents\\in.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNext()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
