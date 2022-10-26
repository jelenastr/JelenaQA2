package Lecture3;

public class CashDepositWithdraw {

    private int bankBalance = 0;
        public void deposit(int amount){
            if (amount >= 10000) {
                System.out.println("Need to register sum in VID!");
            } else {
                bankBalance = bankBalance + amount;
                System.out.println("You have deposited " + amount + " euros");
            }
        }
        public void withdraw(int amount){
            if (amount >= 700) {
                System.out.println("Daily limit exceeded!");
            } else {
                if (bankBalance - amount <= 0) {
                    System.out.println("Not enough money to withdraw!");
                } else {
                    bankBalance = bankBalance - amount;
                    System.out.println("You have withdraw " + amount + " euros from your account");
                }
            }
        }
        public void checkBalance(){
            System.out.println("You have " + bankBalance + " euros on your account");
        }
    }
