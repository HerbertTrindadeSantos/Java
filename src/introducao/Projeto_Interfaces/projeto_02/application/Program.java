package introducao.Projeto_Interfaces.projeto_02.application;

import introducao.Projeto_Interfaces.projeto_02.entities.Contract;
import introducao.Projeto_Interfaces.projeto_02.services.ContractService;
import introducao.Projeto_Interfaces.projeto_02.services.PaypalPaymentService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato:");
        System.out.print("Numero:");
        int numberContract = sc.nextInt();
        sc.nextLine();

        System.out.print("Data (dd/MM/yyyy):");
        LocalDate date = LocalDate.parse(sc.nextLine(), fmt);

        System.out.print("Valor do contrato R$:");
        double valueContract = sc.nextDouble();

        System.out.print("Entre com o numero de parcelas: ");
        int numberInstallments = sc.nextInt();

        Contract contract = new Contract(numberContract, date, valueContract);
        ContractService contractService = new ContractService(new PaypalPaymentService());
        contractService.processContract(contract, numberInstallments);

        System.out.println("Parcelas:");
        System.out.println(contract);


        sc.close();
    }
}
