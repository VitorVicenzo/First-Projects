import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Abertura de Scanner e definição do ponto decimal.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Declaração de variáveis.
        int operation = 0, senha = 0;
        double  valor_Saque, valor_Deposito = 0.0, total_Conta = 0.0;
        
        //Interface do usuário + Looping.
        while (operation != 4){
            System.out.println("------ BEM-VINDO AO BANCO CENTRAL ------");
            System.out.println("1. Sacar dinheiro.");
            System.out.println("2. Depósito de dinheiro.");
            System.out.println("3. Verificação de saldo.");
            System.out.println("4. Sair.");
            System.out.println("Digite o número da operação desejada:");
            operation = sc.nextInt();
            
            switch (operation) {
                
                //SAQUE DE DINHEIRO.
                case 1 :
                    //SENHA.
                    System.out.println("Digite sua senha padrão (1234): ");
                    senha = sc.nextInt();
                    while (senha != 1234){
                        System.out.println("Você errou a senha!");
                        System.out.println("Digite sua senha padrão (1234): ");
                        senha = sc.nextInt();
                    }
                    //SAQUE CONDICIONAL.
                    System.out.println("Quanto deseja sacar ?");
                    valor_Saque = sc.nextDouble();
                    if (valor_Saque > total_Conta) {
                        System.out.println("Você não tem saldo suficiente! Faça um depósito primeiro");
                        System.out.println("Esse é o seu saldo: " + total_Conta);
                        operation = 0;
                    } else {
                        System.out.println("Saque efetuado com sucesso!");
                        total_Conta = total_Conta - valor_Saque;
                    }
                    break;

                    //DEPÓSITO DE DINHEIRO.
                case 2 :
                    //SENHA.
                    System.out.println("Digite sua senha padrão  (1235): ");
                    senha = sc.nextInt();
                    while (senha != 1235){
                        System.out.println("Você errou a senha!");
                        System.out.println("Digite sua senha padrão (1235): ");
                        senha = sc.nextInt();
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
            }

        }
        sc.close();
    }
}
