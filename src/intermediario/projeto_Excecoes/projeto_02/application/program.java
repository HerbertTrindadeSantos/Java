package intermediario.projeto_Excecoes.projeto_02.application;

import intermediario.projeto_Excecoes.projeto_02.entities.Account;
import intermediario.projeto_Excecoes.projeto_02.exceptions.InsufficientAccountBalanceException;
import intermediario.projeto_Excecoes.projeto_02.exceptions.WithdrawalLimitExceededException;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main (String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Entre com os dados da conta:");
        System.out.print("Numero:");
        int accountNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Titular da conta:");
        String holder = sc.nextLine();
        System.out.print("Deposito inicial:");
        double balance = sc.nextDouble();
        System.out.print("Limite de saque:");
        double withdrawLimit = sc.nextDouble();
        Account ac = new Account(accountNumber,holder,balance,withdrawLimit);
        System.out.println();
        System.out.print("Digite o valor do saque:");
        double amountWithdraw = sc.nextDouble();
        try {
            ac.withdraw(amountWithdraw);
        } catch (WithdrawalLimitExceededException e) {
            System.out.println(e.getMessage());
        }catch (InsufficientAccountBalanceException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println(ac);
            sc.close();
        }

    }
}
