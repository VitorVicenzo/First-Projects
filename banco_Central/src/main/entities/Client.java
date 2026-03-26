package main.entities;

public class Client {

    private String name;
    private int password;
    private int number_Account;
    
    public Client(String name, int password, int number_Account){
        this.name = name;
        this.password = password;
        this.number_Account = number_Account;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getPassword() {
        return password;
    }
    public void setPassword(int password) {
        this.password = password;
    }
    
    public int getNumber_Account() {
        return number_Account;
    }
    public void setNumber_Account(int number_Account) {
        this.number_Account = number_Account;
    }


}
