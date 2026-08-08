/*
Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
 */

package ex00;

import java.util.Scanner;

public class main {
    public static void main( String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numero que voce quer adicionar na variavel: ");
        int num = sc.nextInt();
        
        int[] vet = new int[num];

        for(int i = 0; i < num; i++){
            System.out.printf("lnDigite o %dº do vetor: ", i + 1);
            vet [i] = sc.nextInt();

           
        }
      for(int i = 0; i < num; i++ ){
         
        if(vet[i] < 0){
                System.out.printf("\n%d", vet[i]);
            }
      }

    }
}
