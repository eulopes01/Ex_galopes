//Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
//um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
//4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
//que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
//mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
//exemplo.




package ex02;

import java.util.Scanner;

public class Post {
    public static void main( String [] args)
    {
        int Alcool = 0, Gasolina = 0, Diesel = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Alcool \n2. Gasolina \n3. Diesel. \n4. Fim");
        System.out.printf(" O que voce deseja?");
        int choice = sc.nextInt();

        while( choice != 4)
        {
            if (choice == 1)
                Alcool += 1;
            else if (choice == 2)
                Gasolina += 1;
            else if (choice == 3)
                Diesel += 1;

            if(choice != 1 && choice != 2 && choice != 3  )
            {
                System.out.printf(" Codigo invalido\n");
            }
                System.out.printf(" O que voce deseja?\n");
            choice = sc.nextInt();
            
        }
        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool:%d\n", Alcool);
        System.out.printf("Gasolina:%d\n", Gasolina );
        System.out.printf("Diesel:%d\n", Diesel);

     sc.close();
    }
}
