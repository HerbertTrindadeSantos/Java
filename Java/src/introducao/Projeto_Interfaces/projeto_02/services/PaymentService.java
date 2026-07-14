package introducao.Projeto_Interfaces.projeto_02.services;

public interface PaymentService {
    double calculateTaxInstallmentValue(double amount);
    double calculateTaxPaymentValue(double amount, int month);
}
