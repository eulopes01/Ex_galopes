package ex01;

import java.util.Locale;
import java.util.Scanner;

public class square{
    public static void main(String[] args){

        Locale.setDefault(Locale.US);// Aqui estou falando que vai deixar estilo estados unidos
        Scanner sc = new Scanner(System.in);

        double Prohibited;
        double c;

        Prohibited = sc.nextDouble();
         c = (Prohibited * Prohibited) * 3.14159;

        System.out.printf("Saida %.4f", c);

        sc.close();
    }
}