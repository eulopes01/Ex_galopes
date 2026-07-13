/*Fazer um programa para ler os valores da largura e altura
de um retângulo. Em seguida, mostrar na tela o valor de
sua área, perímetro e diagonal. Usar uma classe como
//mostrado no projeto ao lado. */

import java.util.Scanner;


public class retangulo{
   public static void main( String[] args)
   {
      Scanner sc = new Scanner(System.in);
   System.out.println("digite o valor que voce quer na largura: ");
   double lar = sc.nextDouble();

      System.out.println("digite o valor que voce quer na largura: ");
      double alt = sc.nextDouble();

      System.out.printf("O valor da area é: %.2f\n", retan.areadouble(lar, alt));
      System.out.printf("O valor do seu perimetro é: %.2f\n", retan.perimetroDouble(lar, alt));
      System.out.printf("O valor do seu diagonal é: %.2f\n", retan.diagonalDouble(lar, alt));


   }

}
    
