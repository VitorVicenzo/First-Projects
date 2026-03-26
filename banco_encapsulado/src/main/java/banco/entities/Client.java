package banco.entities;

public class Client {

    private int id_Account;
    private String name;
    private double deposit;
    private double balance;
    private double withdraw;
    
   

    public Client(){

    }

    public Client(int id_Account, String name) {
        this.id_Account = id_Account;
        this.name = name;
    }

    public Client(int id_Account, String name, double deposit) {
        this.id_Account = id_Account;
        this.name = name;
        this.deposit = deposit;
    }

     public double getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(double withdraw) {
        this.withdraw = withdraw;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getId_Account() {
        return id_Account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public void client_Deposit(){
        balance += this.deposit;
    }

    public void client_Withdraw(){
        balance -= (this.withdraw + 5) ;
    }

}
