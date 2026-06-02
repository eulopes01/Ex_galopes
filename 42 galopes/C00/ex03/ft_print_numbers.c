/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_print_numbers.c                                 :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: galopes <galopes@student.42.fr>            +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2026/04/26 18:52:09 by galopes           #+#    #+#             */
/*   Updated: 2026/04/26 20:51:25 by galopes          ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

//(LINHA 01) #include <unistd.h> - Biblioteca fala para o compilador que o
//-> nosso write existe para o comṕilador

//(LINHA 02) void ft_print_numbers(void) - Assinatura da nossa
//-> função, dentro dessa assinatura vai todo nosso codigo.

//(LINHA 03) int i; - Declração da nossa varivel do tipo inteiro

//(LINHA 04) i = '0'; - Aqui estou atribuindo o valor de carctere '0'
//-> para nossa variavel i

//(LINHA 05) while(i <= '9') - Nosso while, nosso loop, ele tem uma condição
//-> enquanto nossa varivavel i do valor '0' for menor ou igual que que '9'
//-> ele vai exibir na tela cada numero ate o '9'

//(LINHA 06) write(1, &i, 1); - é resposavel por exibir na tela toda 
//-> todas os numeros

//(LINHA 07)  i++; - aqui estamos acrescentando mais 1, então como nossa
//-> variavel i começar em 0  depois que ela passar por i++; vai valer 
//-> 1 e assim vai aumentando até chegar no 9

//(LINHA 08) write(1, &"\n", 1); - Apenas um quebra de linha


#include <unistd.h>

void ft_print_numbers(void)
{
    int i;

    i = '0';

    while(i <= '9')
    {
        write(1, &i, 1);
        i++;
    }  
    //write(1, "\n", 1);
}

//int main()
//{
//    ft_print_numbers();  
//}