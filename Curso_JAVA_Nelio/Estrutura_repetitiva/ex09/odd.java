//Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
//X, se for o caso.

import java.util.Scanner;

public class odd
{
    public static void main(String [] args)
    {
       int x;

        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite o numero ");
        x = sc.nextInt();

        for( int i = 0; i <= x; i++)
        {
             if(i % 2 == 1)
                System.out.println(i);
        }
    sc.close();
    }
}