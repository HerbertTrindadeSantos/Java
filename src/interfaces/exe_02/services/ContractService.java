package interfaces.exe_02.services;

import interfaces.exe_02.entities.Contract;
import interfaces.exe_02.entities.Installment;


public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public double getTaxPaymentFee(double valueInstallment) {
        return onlinePaymentService.paymentFee(valueInstallment);
    }


    public double getTaxInterest(double valueInstallment, int month) {
        return onlinePaymentService.interest(valueInstallment, month);
    }

    public void processContract(Contract contract, int months) {


        double valueInstallment = contract.getTotalValue() / months;

        for (int i = 1; i <= months; i++) {

            double valueTotalInstallment = 0.0;

            valueTotalInstallment += this.getTaxPaymentFee(valueInstallment) + valueInstallment;

            valueTotalInstallment += this.getTaxInterest(valueTotalInstallment, i);

            contract.getInstallment().add(new Installment(contract.getDate().plusMonths(i), valueTotalInstallment));
        }
    }
}
