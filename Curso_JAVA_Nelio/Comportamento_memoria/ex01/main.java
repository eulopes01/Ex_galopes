/*
Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor
*/

import java.util.Scanner;

public class main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("Digite quantos numero voce quer colocar no vetor: ");
        int qtd_number_veotr = sc.nextInt();
        int[] vet = new int[qtd_number_veotr];
        

        for(int i = 0; i < qtd_number_veotr; i++){
            System.out.printf("Digite o %dº do numero do vetor: ", i + 1);
            vet[i] = sc.nextInt();
        }

        int soma = 0;
		for(int i = 0; i < qtd_number_veotr; i++){
			soma = soma + vet[i];
		}

		int media = soma / qtd_number_veotr;


		System.out.print("\nValores: ");

		    for(int i = 0; i < qtd_number_veotr; i++){
				System.out.printf(" %d", vet[i]);
            }
			
			System.out.printf("\nsoma: %d", soma);
			System.out.printf("\nsoma: %d\n ", media);

    }
}