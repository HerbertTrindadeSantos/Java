package Projeto_POO.projeto_02.model.services;

import Projeto_POO.projeto_02.model.entities.DigitalProduct;
import Projeto_POO.projeto_02.model.entities.Order;
import Projeto_POO.projeto_02.model.entities.OrderItem;
import Projeto_POO.projeto_02.model.interfaces.Shippable;
import Projeto_POO.projeto_02.model.interfaces.Taxable;

import java.io.*;
import java.time.format.DateTimeFormatter;

public class OrderReport {

    private static final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public String printer(Order order) {
        StringBuilder sb = new StringBuilder();
        sb.append("==============================================\n");
        sb.append("               RESUMO DO PEDIDO               \n");
        sb.append("==============================================\n");
        sb.append("Data: ").append(order.getMoment().format(fmt)).append("\n");
        sb.append("Status: ").append(order.getStatus()).append("\n");
        sb.append("Cliente: ").append(order.getClient().getName()).append("\n");
        sb.append("Data nascimento: ").append(order.getClient().getBirthDate().format(fmt)).append("\n");
        sb.append("Email: ").append(order.getClient().getEmail()).append("\n");
        sb.append("----------------------------------------------\n");
        sb.append("ITEMS:\n");

        for (OrderItem item : order.getItems()) {
            sb.append(" - ").append(item.getProduct().getName()).append("\n")
                    .append(" Qtd: ").append(item.getQuantity()).append(" x")
                    .append(" | Valor R$:").append(String.format("%.2f", item.getProduct().getPrice()))
                    .append(" | Valor com taxas R$:").append(String.format("%.2f", item.getProduct().totalValue()))
                    .append(" | Valor Total R$:").append(String.format("%.2f",item.subTotal()));

            if (item.getProduct() instanceof Taxable taxable) {
                sb.append(" | ").append(taxable.taxInfo());
            }
            if (item.getProduct() instanceof Shippable shippable) {
                sb.append(" | ").append(shippable.shippingInfo());
            }
            if (item.getProduct() instanceof DigitalProduct digitalProduct) {
                sb.append("\n").append(" | Link:").append(digitalProduct.getLink()).append(" | Data de expiracao:")
                        .append(digitalProduct.getDateExpiration().format(fmt));
            }
            sb.append("\n");
        }
        sb.append("-------------------------------------------\n");
        sb.append("TOTAL: R$").append(String.format("%.2f", order.total())).append("\n");
        sb.append("=================================================\n");
        return sb.toString();
    }

    public void saveToFile(Order order, String filePath){
        String content = printer(order);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))){
            writer.write(content);
            System.out.println("Relatório salvo em: "+ filePath);
        } catch (IOException e) {
            System.out.println("Erro ao salvar o relatório: "+ e.getMessage());
        }
    }
}
