package intermediario.projeto_Excecoes.projeto_02.entities;

import intermediario.projeto_Excecoes.projeto_02.exceptions.InsufficientAccountBalanceException;
import intermediario.projeto_Excecoes.projeto_02.exceptions.WithdrawalLimitExceededException;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount) throws WithdrawalLimitExceededException, InsufficientAccountBalanceException{
        if (amount > this.withdrawLimit){
            throw new WithdrawalLimitExceededException(this.withdrawLimit,amount);
        }
        if (amount > this.balance){
            throw new InsufficientAccountBalanceException(this.balance,amount);
        }else {
            this.balance -= amount;
        }

    }

    @Override
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", holder='" + holder + '\'' +
                ", balance=" + balance +
                ", withdrawLimit=" + withdrawLimit +
                '}';
    }
}
