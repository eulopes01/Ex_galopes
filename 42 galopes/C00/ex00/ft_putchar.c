/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_putchar.c                                       :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: galopes <galopes@student.42.fr>            +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2026/04/26 15:33:27 by galopes           #+#    #+#             */
/*   Updated: 2026/04/26 20:46:26 by galopes          ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

//(LINHA 01) #include <unistd.h> - Esta linha inclui a biblioteca
//-> é a biblioteca que fala que o write existe

//(LINHA 02) void ft_putchar(char c) - È assinatura da nossa função
//-> dentra da nossa assinatura vai toda o nosso programa

//(LINHA 03) write(1, &c, 1); - O nosso Write que vai exibir
//-> o que a gente passar como parametro

#include <unistd.h>

void ft_putchar(char c)
{
    write(1, &c, 1);
}

//int main(void)
//{
//    ft_putchar('H');
//    return 0;
//}