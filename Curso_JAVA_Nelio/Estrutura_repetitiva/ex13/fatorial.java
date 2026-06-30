//Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
//Lembrando que, por definição, fatorial de 0 é 1.

import java.util.Scanner;

public class fatorial
{
    public static void main(String[] args)
    {
        int soma = 1;
       Scanner sc = new Scanner(System.in);
          
       System.out.printf("Por favor digite o numero: ");
       int fat = sc.nextInt(); 

       for(int i = 1 ; i <= fat; i++ )
       {
           soma = i * soma;
       }
       System.out.println(soma);

       sc.close();
    }
}