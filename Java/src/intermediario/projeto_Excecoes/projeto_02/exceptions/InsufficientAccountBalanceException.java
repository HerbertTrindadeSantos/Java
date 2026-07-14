package intermediario.projeto_Excecoes.projeto_02.exceptions;

public class InsufficientAccountBalanceException extends Exception {
    public InsufficientAccountBalanceException(double balance, double amount) {
        super("Não há saldo suficiente na conta para o saque: Saldo R$"+balance+" Saque R$"+amount);
    }
}
