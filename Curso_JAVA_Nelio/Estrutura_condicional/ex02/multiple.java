//Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
//Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
//ordem crescente ou decrescente.

package ex02;

public class multiple
{
    public static void main(String[] args)
    {
        int A;
        int B;

        A = 24;
        B = 6;

        if (A % B == 0)
        {
            System.out.println("Sao Multiplos");
        }
        else
        {
            System.out.println("Nao sao Multiplos");
        }
    }
}