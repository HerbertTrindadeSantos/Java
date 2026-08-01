package Generics.exe_07;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //System.out.println("Digite o caminho do arquivo: ");
        //String filePath = sc.nextLine();

        File file = new File("/home/herbert/Documentos/out/txt_2.csv");

        Map<String,Integer> voting = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            String line = br.readLine();

            while (line != null){

                String[] fields = line.split(",");
                String name = fields[0];
                int qtdVotes = Integer.parseInt(fields[1]);

                if (voting.containsKey(name)){
                    int qtdVotesTotal = voting.get(name) + qtdVotes;
                    voting.put(name,qtdVotesTotal);
                }else {
                    voting.put(name, qtdVotes);
                }

                line = br.readLine();

                for (String key : voting.keySet()){
                    System.out.println(key+": " + voting.get(key));
                }
            }

        } catch (IOException e){
            System.out.println("Erro no processamento de entrada e saida de dados: " + e.getMessage());
        }

        sc.close();
    }
}
