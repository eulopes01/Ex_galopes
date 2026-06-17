//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
//seguir, calcule e mostre o valor da conta a pagar.

package ex04;

import java.util.Scanner;

public class table
{
    public static void main(String[] args)
    {
        double item;
        double unit;
        double total;


        Scanner scc = new Scanner(System.in);

        System.out.println("1. Cachorro Quente   R$ 4.00 \n2. X-Salada R$ 4.50 \n3. X-Bacon R$ 5.00 \n4. Torrada simples R$ 2.00 \n5. Refrigerente R$ 1.50 ");

        System.out.printf(" Por favor, escolhar uma coisa para ser compranda?");
        item = scc.nextDouble();

        System.out.printf(" Me informe a quantida de itens que voce quer ");
        unit = scc.nextDouble();

        if (item == 1)
        {
            total = unit * 4;
        
        }
        else if( item == 2)
        {
            total = unit * 4.50;
        }
         else if( item == 3)
        {
            total = unit * 5;
        }
         else if( item == 4)
        {
            total = unit * 2;
        }
         else
        {
            total = unit * 1.50;
        }   


        System.out.printf("TOTAl: R$%.2f", total);
    }
}