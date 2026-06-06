//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
//de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).


import java.util.Scanner;

public class different
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int A;
        int B;
        int C;
        int D;
        int sum;        
        System.out.printf("Digite o seu primeiro numero ai: ");
        A = sc.nextInt();

        System.out.printf("Digite o segundo numero ai: ");
        B = sc.nextInt();

        System.out.printf("Digite o terceiro numero ai: ");
        C = sc.nextInt();

        System.out.printf("Digite o quarto numero ai: ");
        D = sc.nextInt();

        sum = (A * B) - (C * D);

        System.out.printf("A diferença entre A, B, C e D é: %d\n", sum);
sc.close();
    }

}