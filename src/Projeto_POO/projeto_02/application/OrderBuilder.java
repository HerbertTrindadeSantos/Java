package Projeto_POO.projeto_02.application;

import Projeto_POO.projeto_02.model.entities.*;
import Projeto_POO.projeto_02.model.enums.OrderStatus;
import Projeto_POO.projeto_02.model.enums.ProductOrigin;
import Projeto_POO.projeto_02.model.enums.ProductType;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class OrderBuilder {

    private final Scanner sc;
    private final DateTimeFormatter fmt;

    public OrderBuilder(Scanner sc, DateTimeFormatter fmt) {
        this.sc = sc;
        this.fmt = fmt;
    }

    public Client readClient() {
        System.out.println("Digite os dados do cliente:");
        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        LocalDate birthDate = readDate("Data de nascimento (dd/MM/yyyy):");
        return new Client(name, email, birthDate);
    }

    public Order readOrder(Client client) {
        System.out.println("Digite os dados dos pedidos:");
        int statusIndex = readInt("Digite o numero do Status do produto: [0-PAGAMENTO_PENDENTE/1-PROCESSANDO/2-ENVIADO/3-ENTREGUE]");
        return new Order(LocalDateTime.now(), OrderStatus.searchId(statusIndex), client);
    }

    public void readItem(Order order) {
        int qtdItems = readInt("Digite a quantidade de items no pedido :");

        for (int i = 0; i < qtdItems; i++) {
            System.out.println("Digite o #" + (i + 1) + " pedido:");
            int code = readInt("Escolha o tipo do produto: [1-Produto digital/2-Produto físico]");

            System.out.print("Nome do produto: ");
            String name = sc.nextLine();
            double price = readDouble("Preco do produto: R$");
            int quantity = readInt("Quantidade: ");

            try {
                Product pdt = creatProduct(code, name, price);
                order.addItem(new OrderItem(quantity, pdt));
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage() + ". Item ignorado.");
            }
        }
    }

    private Product creatProduct(int code, String name, double price) {
        ProductType type = ProductType.fromCode(code);
        return switch (type) {
            case PRODUTO_DIGTAL -> createDigitalProduct(name, price);
            case PRODUTO_FISICO -> createPhysicalProduct(name, price);
        };
    }

    private Product createDigitalProduct(String name, double price) {
        System.out.print("Link do produto: ");
        String link = sc.nextLine();
        LocalDate dateExpiration = readDate("Data de expiracao (dd/MM/yyyy):");
        return new DigitalProduct(name, price, link, dateExpiration);
    }

    private Product createPhysicalProduct(String name, double price) {
        double weight = readDouble("Peso (g):");
        double dimension = readDouble("Comprimento (m):");
        int code = readInt("Origem do produto [1-Importado/2-Local]: ");

        ProductOrigin origin = ProductOrigin.fromCode(code);
        return switch (origin) {
            case PRODUTO_IMPORTADO -> new ImportedProduct(name, price, weight, dimension);
            case PRODUTO_NACIONAL -> new LocalProduct(name, price, weight, dimension);
        };
    }

    private int readInt(String prompt) {
        do {
            try {
                System.out.print(prompt);
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida! Digite um número inteiro.");
            }
        } while (true);
    }

    private double readDouble(String prompt) {
        do {
            try {
                System.out.print(prompt);
                return Double.parseDouble(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida!Digite um numero real.");
            }
        } while (true);
    }

    private LocalDate readDate(String prompt) {
        do {
            try {
                System.out.print(prompt);
                return LocalDate.parse(sc.nextLine().trim(), fmt);
            } catch (DateTimeParseException e) {
                System.out.print("Data inválida! Use o formato dd/MM/yyyy. ");
            }
        } while (true);
    }



}
