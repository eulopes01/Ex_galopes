/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_print_reverse_alphabet.c                        :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: galopes <galopes@student.42.fr>            +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2026/04/26 18:12:27 by galopes           #+#    #+#             */
/*   Updated: 2026/04/26 20:50:44 by galopes          ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

//(LINHA 01) #include <unistd.h> - Biblioteca fala para o compilador que o
//-> nosso write existe para o comṕilador

//(LINHA 02) void ft_print_reverse_alphabet(void) - Assinatura da nossa
//-> função, dentro dessa assinatura vai todo nosso codigo

//(LINHA 03) char letra_z; - estou declarando a nossa variavel do tipo
//-> char

//(LINHA 04) letra_z = 'z'; - A nossa variavel esta recebendo um valor de
//-> carctere 'z'

// (LINHA 05) while(letra_z >= 'a') - Nosso loop while recebe uma condição
//-> enquanto nossa variavel que tem o valor de 'z' for maior ou igual a
//-> ele vai exibir e vai decrementar uma casa, assim fazendo ele exibir
//-> de tras para frente, inves de começar em 'a' ele vai começar em 'z'
//-> e vai ate 'a'

//(LINHA 06) write(1, &letra_z ,1); - é resposavel por exibir na tela toda 
//-> todas as letras do alfabeto

//(LINHA 07) letra_z--; - é resposavel por fazer o nosso alfabeto
//-> ir de tras para frente

//(LINHA 08) write(1, &"\n", 1); - Apenas um quebra de linha



#include <unistd.h>

void ft_print_reverse_alphabet(void)
{
    char letra_z;

    letra_z = 'z';

    while(letra_z >= 'a')
    {
        write(1, &letra_z ,1);
        letra_z--;        
    }
   //write(1, &"\n", 1);
    
}

//int main()
//{
//ft_print_reverse_alphabet();
//}