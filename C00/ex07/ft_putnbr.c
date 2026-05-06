/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_putnbr.c                                        :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: galopes <galopes@student.42.fr>            +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2026/04/28 19:39:39 by galopes           #+#    #+#             */
/*   Updated: 2026/05/04 20:59:37 by galopes          ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

#include <unistd.h>

void ft_putint(int nbn)
{
    int i;
    
    i = nbn;
   if (nbn >= 10)
  {
    nbn = nbn / 10;
    ft_putint(nbn);
    nbn = i % 10;     
  } 
  nbn = nbn + '0';
  write(1, &nbn, 1);
}

void ft_putnbr(int nb)
{
  if (nb < 0)
  {
    if(nb == -2147483648)
    {
      write(1, "-", 1);
      ft_putint(214748364);
      write(1, "8" ,1);
      return;
    }
    write(1, "-", 1);
    nb = nb * -1;  
  }  
  ft_putint(nb);
}

//int main()
//{
//  ft_putint(2147483648);
//}