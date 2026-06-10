package intermediario.Projetos_Arquivos.Testes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Teste02 {
    public static void main(String[] args) {
        File file = new File("c:\\users\\Herbert\\Documents\\in.txt");
        FileReader fr = null;
        BufferedReader br = null;
        try{
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            String line = br.readLine();
            while(line != null){
                System.out.println(line);
                line = br.readLine();
            };
    } catch (IOException e){
            System.out.println(e.getMessage());
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }finally {
            try {
                fr.close();
                br.close();
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());;
            }
            catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
