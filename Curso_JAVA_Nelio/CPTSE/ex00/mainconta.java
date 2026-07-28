

import java.util.Scanner;

public class mainconta{
        public static void main(String [] args) {
            Scanner sc = new Scanner(System.in);
            Conta c1 = new Conta();
            double saldo;

            System.out.printf("Enter account number: ");
            int numeroConta = sc.nextInt();
            sc.nextLine();

            System.out.printf("Enter account holder: ");
            String titular = sc.nextLine();

            System.out.printf("Is there na initial deposit (s/n)? ");
            String Resposata_deposito_inicial = sc.nextLine();

            System.out.printf("Enter initial deposit value: ");
            if (Resposata_deposito_inicial.equalsIgnoreCase("S")){
                saldo = sc.nextDouble();
                 c1 = new Conta(numeroConta, titular, saldo);
            }
            else {
                c1 = new Conta(numeroConta, titular);
            }

            System.out.println("Account data:");
            System.out.printf("Account %d, Holder: %s, Balance: %.3f \n", numeroConta, titular, c1.saldo);

            System.out.println("Enter a deposit value:");
            c1.depositar(sc.nextDouble());

            System.out.println("Updated account data:");
            System.out.printf("Account %d, Holder: %s, Balance: %.3f \n", numeroConta, titular, c1.saldo);

            System.out.println("Enter a withdraw value:");
            c1.sacar(sc.nextDouble());

            System.out.println("Updated account data:");
            System.out.printf("Account %d, Holder: %s, Balance: %.3f \n", numeroConta, titular, c1.saldo);


        }
}