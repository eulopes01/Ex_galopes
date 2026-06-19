//Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
//cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
//menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma)
package ex01;


import java.util.Scanner;

public class cartesiano {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite o primeiro numero: ");
        double x = sc.nextDouble();

        System.out.printf("Digite o segundo numero: ");
        double y = sc.nextDouble();

        while( x != 0 && y != 0)
        {
            if(x > 0 && y > 0)
                System.out.println("primeiro");
            else if( x < 0  && y > 0)
                System.out.println("segundo");
            else if( x < 0  && y < 0)
                System.out.println("terceiro");
            else
                 System.out.println("quarto");

            System.out.println("Digite o primeiro numero: ");
            x = sc.nextDouble();

            System.out.println("Digite o segundo numero: ");
             y = sc.nextDouble();            
        }
        sc.close();
    }
}
