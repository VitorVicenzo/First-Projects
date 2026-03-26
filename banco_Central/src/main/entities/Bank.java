package main.entities;

public class Bank {

    private final double withdraw_Tax = 5;
    private double deposit;
    private double withdraw;

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

    
}
 