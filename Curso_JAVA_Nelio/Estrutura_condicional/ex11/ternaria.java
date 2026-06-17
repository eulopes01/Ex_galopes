package ex11;

public class ternaria
{
    public static void main( String [] args)
    {
        double prace = 3500.00;
        double descont = (prace < 2000.00) ?  prace * 0.01 : prace * 0.05;

        System.out.printf("Seu desconto é:%.2f%n", descont);
    }
}