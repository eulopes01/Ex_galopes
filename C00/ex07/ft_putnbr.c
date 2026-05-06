/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_putnbr.c                                        :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: galopes <galopes@student.42.fr>            +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2026/04/28 19:39:39 by galopes           #+#    #+#             */
/*   Updated: 2026/05/05 23:02:43 by galopes          ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */


// Basicamente esse exercico pedi para gente exibir na tela qualquer valor int
//-> tanto positivo ou negativo, e um exercicio legal
#include <unistd.h>// A blibioteca que fala que o write existe

void ft_putint(int nbn)// Assinatura da nossa função 
{
    int i;// Apenas a nossa variavel i
    
    i = nbn;// Nossa variavel i recebendo o nossa variavel nbn do tipo int
   if (nbn >= 10)//Nossa nbn for maior o igual a 10, a gente vai fazer um ngc
   //-> bem legal, a gente vai dividir e chamar a recursão diversas vezes até que seja menor
  {
    nbn = nbn / 10; // Aqui e aonde a gente dividi
    ft_putint(nbn);//Aqui a gente fazendo a nossa recursão
    nbn = i % 10; // Como falado, aqui a gente pega o resta da divisão
  } 
  nbn = nbn + '0';// Como eu ja tinha falado, o write não imprime int
  //-> então a gente precisa usar o nosso "tradutor"
  write(1, &nbn, 1);// Responsavel por exibir
}

void ft_putnbr(int nb)// Assinatura da nossa função, ela é principal
{
  if (nb < 0)// Aqui é resposnavel por verificar se é negativo
  // porque se for negativo  iremos tratar esse numero
  {
    if(nb == -2147483648)// o ultimo maximo negativo é esse
    //-> -2147483648 e o maior numero negativo de int
    //-> a gente não poderia pegar esse numero todo e jogar para positivo
    //-> porque não da, o numero maximo positivo é 2147483647
    //-> porque não é -2147483648 porque o 0 conta tbm
    //-> mas ele não e positivo ele e nulo, porem ele contaria
    
    {
      write(1, "-", 1);//Terminal ele não precisa do sinal de - na frente para
      // -> entender que o numero é negativo, ele sabe
      //-> porem para gente precisa so sinal para saber
      ft_putint(214748364);// estamos passando o nosso valor para ser tratado
      write(1, "8" ,1);// e aqui a gente so exibi o 8 junto com ele para dar o valor maximo, senão não daria
      //-> para mostra
      return;
    }
    write(1, "-", 1);
    nb = nb * -1; //e aqui a gente trasforma ele para positibo
    // -> para trasforma ele para positivo e so vc colocar o sinal 
    //-> de vezs e -1
  }  
  ft_putint(nb);
}

//int main()
//{
//  ft_putint(2147483648);
//}