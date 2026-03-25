package cambio;

import java.util.Locale;
import java.util.Scanner;
import cambio.util.CurrencyConverter;

public class Main {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        /* Data I/O */
        System.out.print("What is the dollar price? ");
        CurrencyConverter.dollar_Price = sc.nextDouble();

        System.out.println("How many dollars will be bought? ");
        CurrencyConverter.dollar_Qty = sc.nextDouble();

        /* Using static member to make the exchange */
        double exchange = CurrencyConverter.exchange_Dollar();
        
        /* Data Output */
        System.out.printf("Amount to be paid in reais = %.2f%n",exchange);
        

        sc.close();
    }
}