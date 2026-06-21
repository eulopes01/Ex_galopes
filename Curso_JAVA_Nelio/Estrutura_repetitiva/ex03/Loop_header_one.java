package ex03;

public class Loop_header_one
{
    public static void main(String [] args)
    {
        int x = 4;
        int y = x + 2;

        for( int i = 0; i < x; i++ )
        {
            System.out.println(x+""+y);
            y = y + 1;
        }
    }
}