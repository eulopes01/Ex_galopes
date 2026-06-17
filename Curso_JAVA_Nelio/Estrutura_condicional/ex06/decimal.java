//Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
//de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
//ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
//Se o ponto estiver na origem, escreva a mensagem “Origem”.
//Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
//situação.

package ex06;

import java.util.Scanner;

public class decimal {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Double x, y;

        System.out.printf("Por favor, me informe o ponto X?");
        x = sc.nextDouble();

        System.out.printf("Por favor, me informe o ponto Y?");
        y = sc.nextDouble();

        if( y > 0  && x > 0)
        {
            System.out.printf("Estamo no Q1\n");
        }
        else if( y > 0 && x < 0)
        {
            System.out.printf("Estamo no Q2\n");
        }
        else if( y < 0 && x < 0)
        {
            System.out.printf("Estamo no Q3\n");
        }
        else if( y < 0 && x > 0)
        {
            System.out.printf("Estamo no Q4\n");
        }
        else
        {
          System.out.printf("Origem\n");  
        }
    sc.close();
    }
}
