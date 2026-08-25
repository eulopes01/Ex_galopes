package ex00;

import java.util.Scanner;

public class alturas{
    public static void main (String[] args){
      
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("Quantas pessoas serao digitadas? ");
        int N = sc.nextInt();

         String [] name = new String[N];
        int [] age = new int[N];
        double [] height = new double[N];

        for(int i = 0; i < N; i++)
        {
            System.out.printf("\nDados da %da pessoa", i + 1);

            System.out.printf("\nNome: ");
            name[i] = sc.next();

            System.out.printf("\nIdade: ");
            age[i] = sc.nextInt();

            System.out.printf("\nAltura: ");
            height[i] = sc.nextDouble();

        }
  
        double soma = 0;
        for(int i = 0; i < N; i++){
            soma = soma + height[i];

        }
        double result = soma / N;

        double age_six = 0;
        for(int i = 0; i < N; i++){
            if(age[i] < 16){
                age_six += 1;
            }
        }
        
        double result_age_six = (age_six / N) * 100;


        

        System.out.printf("Altura média: %.2f", result);
        System.out.printf("\nPessoas com menos de 16 anos: %.1f%% ", result_age_six );

         for(int i = 0; i < N; i++){
            if(age[i] < 16){
                String name_six = name[i];
                System.out.printf("\n%s", name_six);
            }

        }


    }
}