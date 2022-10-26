package Lecture3;

import Lecture2.Bank;

public class BankMain {
    public static void main(String[] args) {
        CashDepositWithdraw bank = new CashDepositWithdraw();
        bank.checkBalance();
        bank.deposit(10000);
        bank.checkBalance();
        bank.deposit(1000);
        bank.checkBalance();
        bank.withdraw(700);
        bank.checkBalance();
        bank.withdraw(555);
        bank.checkBalance();
    }
}
