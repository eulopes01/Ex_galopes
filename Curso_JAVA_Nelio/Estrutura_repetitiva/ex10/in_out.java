//Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
//Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
//essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).

import java.util.Scanner;

public class in_out
{
    public static void main(String [] args)
    {
       Scanner sc = new Scanner(System.in);
       int x;
       int in = 0;
       int out = 0;

       System.out.printf("Digite o qunatos numeros voce quer testar: ");
        x = sc.nextInt();
       
       for(int i = 1; i <= x; i++)
       {
        System.out.printf("Digite o %dº numero: ", i);
        int n = sc.nextInt();

        if(!(n >= 10 && n <= 20))
            out += 1;
        else
            in += 1;
       }

       System.out.printf("%d in\n", in);
       System.out.printf("%d out\n", out);
    sc.close();
    }
}