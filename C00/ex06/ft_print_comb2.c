/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_print_comb2.c                                   :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: galopes <galopes@student.42.fr>            +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2026/04/27 19:48:50 by galopes           #+#    #+#             */
/*   Updated: 2026/05/05 21:37:03 by galopes          ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

//Decidi fazer de um Jeito diferete os comentarios
//-> Comentarios são apenas para demostrar que aprendi
//-> e sei o que cada coisa é o que faz
//-> O codigo foi testado e os comentarios foram colocados depois



#include <unistd.h>// Nossa biblioteca da nossa função ela quer fala
//-> que o write existe para o compilador

void ft_putchar( int n)// Assinatura da nossa função
{
    char temp;// Nossa variavel sendo declarada do tipo char
    char temp2;// Nossa variavel sendo declarada do tipo char
    
    temp = n / 10 + '0';// Nossa variavel temp esta recendo a
    //-> o nossa variavel passada como parametro 'n' esta sendo divida por 10
    //-> o +'0'; funciona como um tradutor que trasforma nosso int em char
    temp2 = n % 10 + '0';//Basicamente vai fazer quase mesma coisa, porem, aqui a gente usa %
    //-> ela vai pegar só o resto da nossa divisão, o valor depois da virgula
    
    write(1, &temp, 1);//Nosso write, ele e responsavel por exibir na tela
   
    write(1, &temp2, 1);//Nosso write, ele e responsavel por exibir na tela
}


void ft_print_comb2()// Assinuatura da nossa função
{
    int s1;//Variavel sendo declarado de tipo int
    int s2;//Variavel sendo declarado de tipo int

    s1 = 0;// A nossa varivael s1 vai começar com o valor 0
    //-> objetivo da nossa varivel é sair de 0 e chegar no 98
    while(s1 <= 98)// Nosso loop/laço, e resposavel por verificar se o nossa variavel é menor 
    //-> ou igual a 98, se for ele vai executar nosso while, vamos ver oque tem dentro dele
    {
        s2 = s1 + 1;// Aqui nossa varivel s2 esta recendo a nossa s1 mais 1 porque s2 sempre precisa estar uma
        //-> a frente da s1 porque a nossa s1 e meio que um "contador" 
        while(s2 <= 99)// temos a nossa segundo while, ele e responsavel de fazer nosso s2 a chegar a 99
        //-> então e enqunto ele for menor ou igual a 99 ele vai ser executado
        //-> ele vai sendo executado ate chegar no 99, ultima saida dele seria isso 00 99
        {
            ft_putchar(s1);// aqui a gente esta chando a nosssa função ft_putchar
            //-> que é responavel por fazer a nossa opreção e exibição nosso programa
            
            write(1, " ", 1);// Aqui a gente so vai exibir um espaço entre os numeros 
            //-> para ficar assim 00 99 e não 0099
            ft_putchar(s2);// aqui a gente esta chando a nosssa função ft_putchar
            //-> que é responavel por fazer a nossa operação e exibição nosso programa
            if (!(s1 == 98 && s2 == 99))// Aqui eu acho um pouco interrante, porque aqui
            //-> a gente passa a condição para o if e coloca um sinal de negação '!'
            //-> basicamente a gente ta falando que se a condição passada for true
            //-> a gente não vai executar, e se for false, a gente executa
            //-> porque depois de cada grupo de numeros a gente precisa coloca uma virgula e ponto
            //-> porem no ultima par de numero não pode ter tanto virgular ou espaço
            {
                write(1, ", ", 2);// Aqui a gente so exibi
            }
            s2++;// a gente adicionna mais um
        }
    s1++;// a gente adicionna mais um
    }
}

//int main()
//{
//ft_print_comb2();   
//}