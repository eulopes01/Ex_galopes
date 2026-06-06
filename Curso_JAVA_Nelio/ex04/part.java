//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

import java.util.Scanner;

public class part
{
    public static void main(String[] args)
    {
        double buy;
        int item, item_uni, itens, itens_uni;
        double item_prace, itens_prace;

        Scanner sc = new Scanner(System.in);
        System.out.printf("-------------------- PRIMEIRO ITEM ---------------------------");
        System.out.printf("\n");
        System.out.printf("Por favor digite o codigo do primeiro item:");
        item = sc.nextInt();

        System.out.printf("Por favor digite o preço do primeiro item: ");
        item_prace = sc.nextInt();

        System.out.printf("Me fala quantas uni dade voce vai querer do item %d: " , item);
        item_uni = sc.nextInt();

        System.out.printf("-------------------- SEGUNDO ITEM ---------------------------");
        System.out.printf("\n");

            System.out.printf("Por favor digite o codigo do segundo item:");
        itens = sc.nextInt();

        System.out.printf("Por favor digite o preço do segundo item: ");
        itens_prace = sc.nextInt();

        System.out.printf("Me fala quantas uni dade voce vai querer do item %d: " , itens);
        itens_uni = sc.nextInt();

        System.out.printf("-------------------- TOTAL DA COMPRA ---------------------------");
        System.out.printf("\n");

        buy = (item_prace * item_uni) + (itens_prace * itens_uni);

        System.out.printf("ITEM: %d\nVALOR UNI: %S\nITEM: %d\nVALOR UNI: %s\n", item, item_prace, itens, itens_prace);
        System.out.printf("VALOR TOTAL: %s", buy);
    sc.close();

    }

}