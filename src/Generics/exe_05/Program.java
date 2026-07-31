package Generics.exe_05;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

public class Program {
    public static void main(String[] args) {

        File filePath = new File("/home/herbert/Documentos/out/txt_1.txt");


        try (BufferedReader br = new BufferedReader(new FileReader(filePath))){

            Set<Access> acesses = new HashSet<>();

            String line = br.readLine();

            while (line != null){
                String[] fields = line.split(" ");
                acesses.add(new Access(fields[0], Instant.parse(fields[1])));
                line = br.readLine();
            }

            System.out.println("Total users: " + acesses.size());

        } catch (IOException e) {
            System.out.println("Erro ao processar entrada e saida de dados: " + e.getMessage());;
        }
    }
}
