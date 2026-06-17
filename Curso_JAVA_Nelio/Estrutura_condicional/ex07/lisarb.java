//Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
//que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
//qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
//Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
//mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.

package ex07;

import java.util.Scanner;

public class lisarb {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        Double Salario;
        Double imposto = 0.0;
        double dif;
;

        System.out.printf("Informe seu salario para S/pagamento do imposto? ");
        Salario = sc.nextDouble();

        if(Salario > 4500){
            imposto = 1000 * 0.08 + 1500 * 0.18;
            dif = Salario - 4500;
            imposto += dif * 0.28;
        }
        else if( Salario > 3000){
            imposto = 1000 * 0.08;
            dif = Salario - 3000;
            imposto += dif * 0.18;
        }
        else if(Salario > 2000){
            dif = Salario - 2000;
            imposto = dif * 0.08;
        }

        if(imposto > 0 ){
            System.out.printf("Imposto R$%.2f\n", imposto);
        }
        else
        {
            System.out.printf("Isento\n");
        }
    }
}
