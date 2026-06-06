//Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
//mostre:
//a) a área do triângulo retângulo que tem A por base e C por altura.
//b) a área do círculo de raio C. (pi = 3.14159)
//c) a área do trapézio que tem A e B por bases e C por altura.
//d) a área do quadrado que tem lado B.
//e) a área do retângulo que tem lados A e B

import java.util.Scanner;

public class mat_base
    {
    public static void main(String[] args)
    {
        double A, B, C;
        double area_triangulo, area_circulo;
        double area_trapezio, area_quadrado, area_retangulo;
        double pi = 3.14159;
        Scanner sc = new Scanner(System.in);

        

            System.out.printf("Digite o valor de A: ");
            A = sc.nextDouble();

            System.out.printf("Digite o valor de C: ");
            B = sc.nextDouble();

            System.out.printf("Digite o valor de B: ");
            C = sc.nextDouble();

            area_triangulo = (A * C) / 2;
            area_circulo = pi * (C * C);
            area_trapezio = ((A + B) * C) / 2;
            area_quadrado = B * B;
            area_retangulo = A * B;

            System.out.printf("TRIANGULO:%.3f\n",area_triangulo);
            System.out.printf("CIRCULO: %.3f\n",area_circulo);
            System.out.printf("TRAPEZIO:%.3f\n",area_trapezio);
            System.out.printf("QUADRADO: %.3f\n",area_quadrado);
            System.out.printf("RETANGULO:%.3f\n",area_retangulo);
    sc.close();
    }
}