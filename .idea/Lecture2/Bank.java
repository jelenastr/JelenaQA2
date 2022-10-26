package Lecture2;

public class Bank {
    private int bankBalance = 1000;
            public void deposit(int amount) {
                bankBalance = bankBalance + amount;
                System.out.println("You have deposited " + amount + " euros");
            }

            public void withdraw(int amount) {
                bankBalance = bankBalance - amount;
                System.out.println("You have withdrawn " + amount + " euros");
            }

            public void checkBalance() {
//                String amount = null;
                System.out.println("You have " + bankBalance + " euros on your bank account");
            }

 //   public void deposit() {

    }

//        deposit(); - prints out – “You have deposited 1000 euros”
//        withdraw(); - “You have withdrawn 1000 euros”
//        checkBalance(); - “You have 1 000 000 euros on your bank account”
//
//public class L2.BankLauncher {
//    public static void main(String[] args) {
//        L2.Bank bankVariable = new L2.Bank();
//        bankVariable.checkBalance();
//        bankVariable.deposit(100000);
//        bankVariable.checkBalance();
//        bankVariable.withdraw(10000);
//        bankVariable.checkBalance();
//    }
//}

