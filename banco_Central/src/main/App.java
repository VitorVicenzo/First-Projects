package main;
import java.util.Locale;
import java.util.Scanner;

import main.entities.Bank;
import main.entities.Client;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Abertura de Scanner e definição do ponto decimal.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Declaração de variáveis.
        String name = null;
        int operation = 0, password = 0, client_Password = 0, number_Account = 0;
        double  withdraw, deposit = 0.0, balance = 0.0;
        
        Client client = new Client(name, password, number_Account);
        Bank bank_Teller = new Bank();

        //Interface do usuário + Looping.
        while (operation != 4){
            System.out.println("------ WELCOME TO THE CENTRAL BANK ------");
            System.out.println("1. First access.");
            System.out.println("2. Deposit.");
            System.out.println("3. Balance verify.");
            System.out.println("4. Withdraw.");
            System.out.println("5. Exit.");
            System.out.println("Write the number of the operation desired: ");
            operation = sc.nextInt();
            

            switch (operation) {
                
                
                case 1 :
                   
                    /*First access. */
                    System.out.println("As your first access write your name, number for your account and your personal password: ");
                    name = sc.nextLine();
                    client.setName(name);

                    System.out.println();
                    number_Account = sc.nextInt();
                    client.setNumber_Account(number_Account);

                    System.out.println();
                    client_Password = sc.nextInt();
                    client.setPassword(client_Password);

                    break;

                    //DEPÓSITO DE DINHEIRO.
                case 2 :
                    
                    System.out.println("Write your password: ");
                    password = sc.nextInt();
                    
                    while (password != client.getPassword()){
                        System.out.println("Wrong password!");
                        System.out.println("Write your password: ");
                        password = sc.nextInt();
                    }
                    
                    //DEPÓSITO CONDICIONAL.
                    System.out.println("How much do you want to deposit? ");
                    deposit = sc.nextDouble();
                    bank_Teller.setDeposit(deposit);
                    bank_Teller.client_Deposit();
                    System.out.println("Your transaction was successfully!");

                   break;
               
                //VERIFICAR SALDO.
                case 3 :
                    System.out.printf("Your balance is: &.2f%n", bank_Teller.getBalance());  
                    break;

                case 4 :
                    System.out.println("");
            }

            
        }
        sc.close();
    }
}
