//Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
//segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".


import java.util.Scanner;

public class div
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        double numb;
        double numb1;
        double result;

        System.out.printf("Digite o numero de notas: ");
        int N = sc.nextInt();

        for(int i = 0; i < N; i++)
        {
            result = 0;

            System.out.printf("Digite o primeiro número: ");
            numb = sc.nextDouble();

            System.out.printf("Digite o segundo número: ");
            numb1 = sc.nextDouble();

            if(!(numb1 == 0 ))           {
                result = numb / numb1;
                System.out.printf("Resultado: %.2f%n ", result);
            }
            else
            {
                System.out.println("divisao impossivel");
            }

            
        }
        sc.close();
    }



}