/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_print_alphabet.c                                :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: galopes <galopes@student.42.fr>            +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2026/04/26 16:25:50 by galopes           #+#    #+#             */
/*   Updated: 2026/04/26 20:49:16 by galopes          ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

//(LINHA 01) #include <unistd.h> - A Biblioteca que fala que nosso write
//-> existe para o nosso compilador

//(LINHA 02) void ft_print_alphabet (void) - E a nossa assinatura da nossa
//-> função, dentro dela vai todo o nosso codigo

//(LINHA 03) char letra_a; - Estamos declarando a nossa variavel do tipo
//-> char, do tipo de uma só carctere.

//(LINHA 04) letra_a = 'a'; - Estou atribuindo uma caractere 'a' para
//-> nossa variavel letra_a

//(LINHA 05)  while(letra_a <= 'z') - Nosso loop, a condição que a gente
//-> esta atribuindo a ele é: ENQUANTO nossa variavel for menor ou igual
//-> o caractere letra z, vai exibir a letra e vai pular para proxima

//(LINHA 06) write(1, &letra_a, 1); - Aqui ele vai ser responsavel por
//-> imprimit na tela cada letra

//(LINHA 07) letra_a++; - Aqui fica reposavel por pular para proximo
//-> caractere, a gente começa na letra 'a' depois que ele passa pelo 
//-> write na LINHA 06 ele vai pular para O caractere b e assim vai ate
//-> o caractere/letra 'z' 

//(LINHA 08) write(1, &"\n", 1); - Depois de imprimir de 'a' até z ele 
//-> vai dar \n que é responsavel por pular para uma newline/nova linha 



#include <unistd.h>

void ft_print_alphabet(void)
{
    char letra_a;

    letra_a = 'a';
    while(letra_a <= 'z')
    {
        write(1, &letra_a, 1);
        letra_a++;
    }    
 //write(1, &"\n", 1);
}

//int main()
//{
//    ft_print_alphabet();
//}