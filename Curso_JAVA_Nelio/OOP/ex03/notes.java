/*Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para
resolver este problema. */
package ex03;
import java.util.Scanner;

public class notes {

    public static void main(String [] args) {

        Student aluno = new Student();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome da pessoa");
        aluno.name = sc.nextLine();

        System.out.println("Digite o nome da pessoa");
        aluno.nota1 = sc.nextInt();
        aluno.nota2 = sc.nextInt();
        aluno.nota3 = sc.nextInt();

        System.out.println("FINAL GRANDE = " + aluno.notaFinal());

        if (aluno.notaFinal() >= 60) {
            System.out.println("PASS");
        }
        else {
            System.out.println("FAILED");
            System.out.println(("MISSING " + aluno.pontosfaltantes() + " POINTS"));
        }
    }
}