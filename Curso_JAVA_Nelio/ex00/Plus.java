import java.util.Scanner;

public class Plus{
    public static void main(String[] args){// Lembrar de sempre colocar o main e não o nome do arquivo

        Scanner sc = new Scanner ( System.in);
        

        int a;
        int b;
       

        a = sc.nextInt();
        b = sc.nextInt();

        int sum = a + b;

        System.out.printf("A Soma é: %d\n", sum);

        sc.close();//Não pode esquecer de fechar
    }
}