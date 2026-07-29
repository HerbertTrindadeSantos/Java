package interfaces.exe_02.application;

import interfaces.exe_02.entities.Contract;
import interfaces.exe_02.services.ContractService;
import interfaces.exe_02.services.PaypalService;

import java.time.LocalDate;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Printer pr = new Printer();

        Contract ct = pr.readContract();

         int qtdInstallment = pr.readInstallment();

        ContractService cs = new ContractService(new PaypalService());

        cs.processContract(ct,qtdInstallment);
        System.out.println(ct);
    }
}
