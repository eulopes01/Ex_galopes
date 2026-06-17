package ex09;

import java.util.Scanner;

public class week {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Por favor, digite o dia da Semana com numero, começando pelo 1 que é domindo? ");

        int x = sc.nextInt();
        String day = "a";

        if(x == 1)
        {
          day =  "Domingo";
        }
        else if(x == 2)
        {
           day =  "Segunda";
        }
        else if(x == 3)
        {
           day =  "Terça";
        }
        else if(x == 4)
        {
          day = "Quarta-Feira";
        }
        else if(x == 5)
        {
           day = "Quita-Feira";
        }
        else if(x == 6)
        {
          day = "Sexta feira";
        }
        else if(x == 7)
        {
           day = "Sabado";
        }

        else
        {
            System.out.printf("Seu dia não existe\n");        
            System.exit(0);    
        }
      System.out.println("O nosso dia da semana é:" + day);
       sc.close();
    }
}