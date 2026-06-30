//Ler um número inteiro N e calcular todos os seus divisores.

import java.util.Scanner;

public class divisores
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Me fala qual numero que voce quer saber: ");
        int div = sc.nextInt(); 

        for(int i = 1; i <= div; i++)
        {
            if(div % i == 0 )
            {
                System.out.println(i);
            }
        }

        sc.close();
    }
}