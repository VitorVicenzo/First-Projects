package main;
import java.util.Locale;
import java.util.Scanner;

import main.entities.Bank;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Abertura de Scanner e definição do ponto decimal.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Declaração de variáveis.
        String name = null;
        int operation = 0, password = 0, number_Account = 0;
        double  valor_Saque, valor_Deposito = 0.0, total_Conta = 0.0;
        

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
                
                //SAQUE DE DINHEIRO.
                case 1 :
                   
                    /*First access. */
                    System.out.println("As your first access write your name, number for your account and your personal password: ");
                    name = sc.nextLine();
                    

                    System.out.println();
                    number_Account = sc.nextInt();
                    

                    System.out.println();
                    password = sc.nextInt();

                    break;

                    //DEPÓSITO DE DINHEIRO.
                case 2 :
                    //SENHA.
                    System.out.println("Digite sua password padrão  (1235): ");
                    password = sc.nextInt();
                    while (password != 1235){
                        System.out.println("Você errou a password!");
                        System.out.println("Digite sua password padrão (1235): ");
                        password = sc.nextInt();
                    }
                    //DEPÓSITO CONDICIONAL.
                    System.out.println("Quanto deseja depositar ?");
                    valor_Deposito = sc.nextDouble();
                    if (valor_Deposito <= 0) {
                        System.out.println("Você não pode fazer um depósito com esse valor!");
                    } else {
                        System.out.println("Depósito efetuado com sucesso!");
                        total_Conta = total_Conta + valor_Deposito;
                    }
                   break;
               
                //VERIFICAR SALDO.
                case 3 :
                    System.out.println("Seu saldo é: " + total_Conta);  
                    break;

                case 4 :
                    System.out.println("");
            }

        }
        sc.close();
    }
}
