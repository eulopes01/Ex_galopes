//Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
//de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
//conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
//peso 5.

import java.util.Scanner;

public class balanced
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        double nota;
        double soma;

        System.out.printf("Digite o numero de notas: ");
        int N = sc.nextInt();

        for(int i = 0; i < N; i++)
        {
            soma = 0;
            for( int x = 0; x < 3; x++)
            {
                System.out.printf("Digite a %dº do Aluno: ", x);
                nota = sc.nextDouble();

                if(x == 0)
                {
                   soma = nota * 2; 
                }
                else if(x == 1)
                {
                    soma = soma + nota * 3;
                }
                else
                {
                    soma = soma + nota * 5;
                }
            }
            nota = soma / 10;
            System.out.printf("A Media do Aluno é %.2f\n", nota);
        }

    sc.close();
    }
}