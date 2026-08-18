/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
considerando a primeira posição como 0 (zero).*/

package ex04;

import java.util.Scanner;

public class maior_posicao {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.printf("Quantos numeros voce vai digitar? ");
        int N = sc.nextInt();

        double[] vet = new double[N];

        for(int i = 0; i < N; i++){
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextDouble();
        }


        double num = vet[0];
        int cont = 0;

        for(int i = 0; i < N; i++){
            if(vet[i] > num){
                num = vet[i];
                cont = i;
            }
        }

        System.out.printf("MAIOR VALOR = %.1f", num);
        System.out.printf("\n POSICAO DO MAIOR VALOR = %d", cont + 1);



    }
    
}
