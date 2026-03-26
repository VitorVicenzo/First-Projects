package main.entities;

public class Bank {

    private final double withdraw_Tax = 5;
    private double deposit;
    private double withdraw;
    private double balance;
    
    public double getBalance() {
        return balance;
    }

    public double getDeposit() {
        return deposit;
    }
    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getWithdraw() {
        return withdraw;
    }
    public void setWithdraw(double withdraw) {
        this.withdraw = withdraw;
    }

    public double client_Deposit(){
        return balance + deposit;
    }

    public double client_Withdraw(){
        return balance - (withdraw + withdraw_Tax);
    }
    
}
 