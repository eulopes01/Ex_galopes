//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//decimais.

import java.util.Scanner;

public class wage
{
    public static void main(String[] args)
    {
     double HH;
     double SS;
     double sum;

     Scanner sc = new Scanner(System.in);

     System.out.printf("Digiti quantas horas voce trabalhou?");
     HH = sc.nextDouble();

     System.out.printf("Digite quanto voce ganha por Hora?");
     SS = sc.nextDouble();

     sum = (HH * SS) * 30;

     System.out.printf("Voce vai receber %.2f", sum);

     sc.close();
    }
}