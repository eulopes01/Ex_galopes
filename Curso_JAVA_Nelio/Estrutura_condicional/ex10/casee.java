package ex10;

import java.util.Scanner;

public class casee {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        String day = "a";

        switch(x)
        {
          case 1:
            day = "Domingo";
            break;
            case 2:
            day = "Segunda";
            break;
            case 3:
            day = "terça";
            break;
            case 4:
            day = "Quarta-feira";
            break;
            case 5:
            day = "Quinta-Feira";
            break;
            case 6:
            day = "Sexta-Feira";
            break;
            case 7:
            day = "Sabado";
            break;
            default:
                System.out.println("Seu dia não existe");
            }

            System.out.println("Seu é:" + day);
    sc.close();

    }
}