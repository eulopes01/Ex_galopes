/*Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
tela todos os números pares, e também a quantidade de números pares.*/


package ex01;
import java.util.Scanner;

public class numeros_pares {
    public static void main(String[] args){
      
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("Quantos numeros voce vai digitar? ");
        int N = sc.nextInt();

        int [] case_vetor = new int[N];

        
        for(int i = 0; i < N; i++)
        {
            System.out.printf("\nDigite um numero: ");
            case_vetor[i] = sc.nextInt();            
        }

        System.out.println("NUMEROS PARES: ");
        int cont = 0;

        for(int i = 0; i < N; i++){
            if(case_vetor[i] % 2 == 0){
                System.out.printf(" %d", case_vetor[i]);
                cont += 1;
            }
        }

        System.out.printf("\nQUANTIDADE DE PARES = %d", cont);

    }
}
