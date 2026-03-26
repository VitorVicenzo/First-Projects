package banco;

import java.util.Locale;
import java.util.Scanner;
import banco.entities.Client;

public class Main {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /* Client resgister */
        System.out.print("Enter account number: ");
        int id_Account = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        String deposit_Initial = sc.nextLine();

        /*Constructor */
        Client client = new Client(id_Account, name);
    
        /*Conditional */
        double deposit = 0.0;
        if (deposit_Initial.equalsIgnoreCase("y")) {
            System.out.print("Enter initial deposit value: ");
            deposit = sc.nextDouble();
            client.setDeposit(deposit);
            client.client_Deposit();
        }

        /*First output data */
        System.out.println();
        System.out.println("Account data:");
        System.out.printf("Account " + client.getId_Account() + ", Holder: " + client.getName() + ", Balance: $ %.2f%n", client.getBalance());

        /*Deposit system */
        System.out.println();
        System.out.print("Enter a deposit value: ");
        deposit = sc.nextDouble();
        client.setDeposit(deposit);
        client.client_Deposit();
        System.out.println("Updated account data:");
        System.out.printf("Account " + client.getId_Account() + ", Holder: " + client.getName() + ", Balance: $ %.2f%n", client.getBalance());

        /*Withdraw system */
        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        client.setWithdraw(withdraw);
        client.client_Withdraw();
        System.out.println("Updated account data:");
        System.out.printf("Account " + client.getId_Account() + ", Holder: " + client.getName() + ", Balance: $ %.2f%n", client.getBalance());

        sc.close();
    }
}