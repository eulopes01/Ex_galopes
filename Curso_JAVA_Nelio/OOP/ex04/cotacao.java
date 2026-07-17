/*Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por
uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda
que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma classe CurrencyConverter
para ser responsável pelos cálculos.*
*
package ex04;

import java.util.Scanner;

public class cotacao{

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        CurrencyConverter x = new CurrencyConverter();


        System.out.print("What is the dollar price? ");
        x.prince = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        x.dor = sc.nextDouble();

        System.out.printf("Amount to be paid in reias = %.2f", x.calc());


    sc.close();
    }

}*/

package ex04;

import java.util.Scanner;

public class cotacao{

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        CurrencyConverter x = new CurrencyConverter();


        System.out.print("What is the dollar price? ");
        double prince = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double dor = sc.nextDouble();

        double relt = x.calc(prince, dor);

        System.out.printf("Amount to be paid in reias = %.2f", relt);


        sc.close();
    }

}



