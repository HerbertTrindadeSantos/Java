package intermediario.Projetos_Arquivos.Testes;

import java.io.File;
import java.util.Scanner;

public class Teste06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o caminho da pasta:");
        String strPath = sc.nextLine();
        File path = new File(strPath);

        File[] files = path.listFiles(File::isFile);
        System.out.println("ARQUIVOS");
        for (File file : files){
            System.out.println(file);
        }

        System.out.println();
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("PASTAS");
        for (File folder : folders){
            System.out.println(folder);
        }

        System.out.println();
        boolean success = new File(strPath + "\\Inf").mkdir();
        System.out.println("Pasta criada com sucesso: "+ success);
    }
}
