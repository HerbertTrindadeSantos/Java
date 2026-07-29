package interfaces.exe_01.services;

public class BrazilTaxService implements TaxService {

    private final static double TAX_RATE_STANDART = 0.20;
    private final static double TAX_RATE_DISCOUNTED = 0.15;
    private final static double DESCOUNTED_THRESHOLD = 100.00;

    @Override
    public double tax(Double amount) {
        if (amount > DESCOUNTED_THRESHOLD) {
            return amount * TAX_RATE_STANDART;
        }
        return amount * TAX_RATE_DISCOUNTED;
    }
}
