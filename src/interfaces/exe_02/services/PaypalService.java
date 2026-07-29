package interfaces.exe_02.services;

public class PaypalService implements OnlinePaymentService {

    private final static double TAX_SIMPLE_INTEREST_RATE = 0.01;
    private final static double TAX_PAYMENT_FEE = 0.02;

    @Override
    public double paymentFee(double amount) {
        return amount * TAX_PAYMENT_FEE ;
    }

    @Override
    public double interest(double amount, int months) {
        return TAX_SIMPLE_INTEREST_RATE * amount * months;
    }
}
