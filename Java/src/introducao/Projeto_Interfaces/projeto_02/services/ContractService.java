package introducao.Projeto_Interfaces.projeto_02.services;

import introducao.Projeto_Interfaces.projeto_02.entities.Contract;
import introducao.Projeto_Interfaces.projeto_02.entities.Installment;

public class ContractService {

    private PaymentService paymentService;

    public ContractService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public PaymentService getPaymentService() {
        return paymentService;
    }

    public void processContract(Contract contract, int month) {
        double valueIntstallment = contract.getTotalValue() / month;
        double valueInstallmentTotal = 0.0;
        double valueInstallmentWithTax = 0.0;
        for (int i = 1; i <= month; i++) {
            valueInstallmentWithTax = paymentService.calculateTaxPaymentValue(valueIntstallment, i) + valueIntstallment;
            valueInstallmentTotal = paymentService.calculateTaxInstallmentValue(valueInstallmentWithTax) + valueInstallmentWithTax;
            Installment installment = new Installment(contract.getDate().plusMonths(i), valueInstallmentTotal);
            contract.addInstallment(installment);
        }

    }
}
