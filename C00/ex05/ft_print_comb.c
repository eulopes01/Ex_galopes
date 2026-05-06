/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_print_comb.c                                    :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: galopes <galopes@student.42.fr>            +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2026/04/26 21:57:36 by galopes           #+#    #+#             */
/*   Updated: 2026/04/27 19:43:08 by galopes          ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

//(LINHA 01) #include <unistd.h> - Biblioteca fala para o compilador que o
//-> nosso write existe para o compilador

//(LINHA 02) void ft_print_comb(void) -Assinatura da nossa função

//(LINHA 03) int a; int b; int c; - essas 3 são as nossas variaveis 
//-> declradas do tipo int/inteiro

//(LINHA 04) a = '0'; - A nossa variavel 'a' recebe o valor de 0
//-> a variavel vai começar em 0.

//(LINHA 05) while(a <= '7') - Nosso while/loop vai receber uma condição
//-> enquanto nossa variavel 'a' for menor ou igual a 7, ele executa

//(LINHA 06) b = a + 1; -A nossa variavel 'b' precisa ser maior que nossa a
//-> porque ela é o meio, ela precisa ser maior que o a e menor que o c
//-> por isso nossa variavel b recebe valor de 'a' + 1, assim 'b' sempre 
//-> estara na frente de 'a'

//(LINHA 07) while( b <= '8') - Aqui seria igual nossa variavel 'a' 
//-> enquanto b for menor ou igual a 8 ele executa

//(LINHA 08) c = b + 1; - Como B precisa ser maior que 'a' nossa variavel c
//-> precisa ser maior que a e b, variavel c precisa ser maior que todas
//-> então c reccebe valor de b + 1

//(LINHA 09)  while(c <= '9') - Enquanto c for maior ou igual a 9 ele executa

//(LINHA 10) write(1, &a/b/c, 1); - Todos os 3 write vai exibir todos os numeros

//( LINHA 11) if(a != '7') -Enquanto nossa variavel 'a' for diferente de '7'
//-> vai ser executado

//(LINHA 12) c++, b++, a++ - todos esses adiciona mais 1 em todas as variaveis
#include <unistd.h>

void ft_print_comb(void)
{
    int a;
    int b;
    int c;

    a = '0';

    while(a <= '7')
    {
        b = a + 1;
        while( b <= '8')
        {
            c = b + 1;
            while(c <= '9')
            {
                write(1, &a, 1);
                write(1, &b, 1);
                write(1, &c, 1);
                    if(a != '7')
                    {
                        write(1, &", ", 2);
                    }
                c++;
            }
         b++;
        }
    a++;
    }    
}

//int main()
//{
//    ft_print_comb();
//    return (0);
//}