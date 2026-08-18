/*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver.*/

import java.util.Scanner;

public class alturas{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        idade_altura x = new idade_altura();


        System.out.println("Digite a sua idade?");
        x.idade = sc.nextInt();
        
        System.out.printf("%d", x.idade );

    }

}