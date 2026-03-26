package main;
import java.util.Locale;
import java.util.Scanner;

import main.entities.Bank;
import main.entities.Client;

public class App {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Variable declaration
        String name = null;
        int operation = 0, password = 0, client_Password = 0, number_Account = 0;
        double  withdraw, deposit = 0.0;
        
        /* Constructor of a reference type */
        Client client = new Client(name, password, number_Account);
        Bank bank_Teller = new Bank();

        //User interface + Looping.
        while (operation != 5){
            System.out.println();
            System.out.println("------ WELCOME TO THE CENTRAL BANK ------");
            System.out.println("1. First access.");
            System.out.println("2. Deposit.");
            System.out.println("3. Balance verify.");
            System.out.println("4. Withdraw.");
            System.out.println("5. Exit.");
            System.out.print("Write the number of the operation desired: ");
            operation = sc.nextInt();
            System.out.println();

            switch (operation) {
                
                
                case 1 :
                   
                    /*First access. */
                    System.out.print("As your first access, write your name: ");
                    name = sc.nextLine();
                    sc.nextLine();
                    client.setName(name);
                
                    System.out.print("Write an id number for your account: ");
                    number_Account = sc.nextInt();
                    client.setNumber_Account(number_Account);

                    System.out.print("Write your personal password: ");
                    client_Password = sc.nextInt();
                    client.setPassword(client_Password);

                    System.out.println("Thanks for register in our bank! We are grateful for having you here!");
                    System.out.println();

                    break;

                    
                case 2 :
                    
                    /* Password manager. */
                    System.out.println("Write your password: ");
                    password = sc.nextInt();
                    
                    while (password != client.getPassword()){
                        System.out.println("Wrong password!");
                        System.out.println("Write your password: ");
                        password = sc.nextInt();
                    }
                    
                    /* Deposit */
                    System.out.println("How much do you want to deposit? ");
                    deposit = sc.nextDouble();
                    bank_Teller.setDeposit(deposit);
                    bank_Teller.client_Deposit();
                    System.out.println("Your transaction was successfully!");

                   break;
               
                /* Balance verify. */
                case 3 :
                    System.out.printf("Your balance is: $" + bank_Teller.getBalance());  
                    System.out.println();
                    break;

                case 4 :

                    /* Password manager. */
                    System.out.println("Write your password: ");
                    password = sc.nextInt();
                    
                    while (password != client.getPassword()){
                        System.out.println("Wrong password!");
                        System.out.println("Write your password: ");
                        password = sc.nextInt();
                    }

                    /* Withdraw with 5$ dollar tax. */
                    System.out.println("How much do you want to withdraw? ");
                    withdraw = sc.nextDouble();
                    bank_Teller.setWithdraw(withdraw);
                    bank_Teller.client_Withdraw();
                    System.out.println("Your transaction was successfully!");

                    break;
            }
        }
        sc.close();
    }
}
