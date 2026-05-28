package Projeto_Set.Projeto_01.application;

import Projeto_Set.Projeto_01.entities.UserLog;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.time.format.DateTimeParseException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        // /home/herbert/Documentos/out/access.txt

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o caminho da pasta: ");
        String strFile = sc.nextLine();


        try (BufferedReader br = new BufferedReader(new FileReader(strFile))) {

            Set<UserLog> logs = new HashSet<>();

            String line = br.readLine();
            while (line != null) {
                String[] dataLogs = line.split(" ");
                logs.add(new UserLog(dataLogs[0], Instant.parse(dataLogs[1])));
                line = br.readLine();
            }
            System.out.println("Total de usuários: " + logs.size());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (DateTimeParseException e){
            System.out.println("Formato de data incorreto "+ e.getMessage());
        }

        sc.close();
    }
}
