package intermediario.projeto_Excecoes.projeto_02.exceptions;

public class WithdrawalLimitExceededException extends Exception {
    public WithdrawalLimitExceededException(double withdrawLimit, double amount) {
        super("O valor do saque R$"+amount+" ,execedeu o valor limite R$"+withdrawLimit);
    }
}
