package introducao.Projeto_POO.projeto_02.application;

import introducao.Projeto_POO.projeto_02.model.entities.*;
import introducao.Projeto_POO.projeto_02.model.services.OrderReport;

import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        OrderBuilder orderBuilder = new OrderBuilder(sc,fmt);

        Client client = orderBuilder.readClient();
        Order order = orderBuilder.readOrder(client);
        orderBuilder.readItem(order);
        OrderReport orderReport = new OrderReport();
        System.out.println(orderReport.printer(order));
        orderReport.saveToFile(order, "relatorio_pedido.txt");
        sc.close();
    }
}
