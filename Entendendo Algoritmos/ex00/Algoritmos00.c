//fazer C - lição
//Temos uma lista de 128 numero, e esteja fazendo uma pesquisa binaria
//Qual e numero maximo de vezes que levaria escontrar nome desejado?

#include <unistd.h>
#include <stdio.h>

void Algoritmos00()
{
    int list;
    int cont;

    list = 128;
    cont = 0;
    while (list > 1)
    {
        list = list / 2;
        cont++;
    }

    printf("%d\n", cont);
}

void main()
{

Algoritmos00();

}