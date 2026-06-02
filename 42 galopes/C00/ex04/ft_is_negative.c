/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_is_negative.c                                   :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: galopes <galopes@student.42.fr>            +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2026/04/26 19:22:31 by galopes           #+#    #+#             */
/*   Updated: 2026/04/27 18:37:23 by galopes          ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

//(LINHA 01) #include <unistd.h> - Biblioteca fala para o compilador que o
//-> nosso write existe para o comṕilador

//(LINHA 02) void ft_is_negative(int n) -Assinatura da nossa função

//(LINHA 03) if( n < 0) - nosso IF, a condição que a gente passa é
//-> caso o numero passado como parametro para o n seja maior que 0
// ele vai exibir N se for nulo ou maior que nulo P

//(LINHA 04) write(1, &"N", 1); - é responsavel por exibir N

//(LINHA 04) write(1, &"P", 1); - é responsavel por exibir P

#include <unistd.h>

void ft_is_negative(int n)
{
    if( n < 0)
    {
        write(1, &"N", 1);
        //write(1, &"\n", 1);
    }
    else
    {
        write(1, &"P", 1);
        //write(1, &"\n", 1);
    }
}

//int main()
//{
//    ft_is_negative(-1);
//}