/*Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe
projetada abaixo. */

package ex02;
import java.util.Scanner;

public class employee {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        banco x = new banco();
            System.out.print("Me fale o seu nome? ");
                x.name = sc.nextLine();
            System.out.print("\nMe fale o seu Salario bruto? ");
                x.salario = sc.nextDouble();
            System.out.print("\nMe fale o seu imposto? ");
                x.tax = sc.nextDouble();

        System.out.printf("Employ: %s, %.2f",x.name, x.NetSalary());

        System.out.print("\nQual e a porcentagem do salario: ");
        x.imposto = sc.nextDouble();

        System.out.printf("Update data %s, %.2f",x.name, x.IncreaseSalary());




    }
}
