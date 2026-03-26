package main.entities;

public class Bank {

    private final double withdraw_Tax = 5;
    private double deposit;
    private double withdraw;
    private String name;
    private int number_Account;
    private int password;
   
    public Bank(String name, int number_Account, int password) {
        this.name = name;
        this.number_Account = number_Account;
        this.password = password;
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

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getNumber_Account() {
        return number_Account;
    }
    public void setNumber_Account(int number_Account) {
        this.number_Account = number_Account;
    }
    
    public int getSenha() {
        return password;
    }
    public void setSenha(int password) {
        this.password = password;
    }
    
}
 