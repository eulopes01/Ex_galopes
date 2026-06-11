//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

package ex03;

public class game
{
    public static void main(String[] args)
    {
        int HHI;
        int HHF;
        int HH;

        HHI = 2;
        HHF = 16;

        if (HHF > HHI)
        {
           HH =  HHF - HHI;
           System.out.printf("O JOGO DUROU %d HORA(S)", HH);
        }
        else if(HHF <= HHI)
        {
            HH = (24 - HHI) + HHF;
            System.out.printf("O JOGO DUROU %d HORA(S)", HH);
        }
        else
        {
            System.out.printf("O JOGO DUROU 24 HORA(S)");
        }
        
    }
}
