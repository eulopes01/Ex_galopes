//Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
//seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
//nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.

package ex05;

import java.util.Scanner;

public class interval {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        double number;


        System.out.printf("Por favor, Informe o numero para gente:");
        number = sc.nextDouble();

        if(number >= 0  && number <= 25 )
        {
            System.out.printf("O numero %.2f esta entre 0 a 25 chefe\n", number);
        }
        else if(number >= 25  && number <= 50 )
        {
          System.out.printf("O numero %.2f esta entre 25 a 50 chef\ne", number);
        }
        else if(number >= 50 && number <= 75 )
        {
          System.out.printf("O numero %.2f esta entre 50 a 75 chef\ne", number);
        }
        else if(number >= 75 && number <= 100 )
        {
          System.out.printf("O numero %.2f esta entre 75 a 100 che\nfe", number);
        }
        else
        {
            System.out.printf("Fora de intervalo\n");
        }
    sc.close();
    }
}
