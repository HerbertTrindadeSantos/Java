package intermediario.projeto_Excecoes.projeto_01.application;


import java.time.format.DateTimeFormatter;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        try {
            ReservationReader br = new ReservationReader(fmt, sc);
            int roomNumber = br.readRoom();
            br.readCheck(roomNumber);
            System.out.println("Digite os dados para atualizar a reserva:");
            br.readCheck(roomNumber);
        }finally {
            sc.close();
        }


    }
}
