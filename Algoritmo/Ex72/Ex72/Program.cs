using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex72
{
    class Program
    {
        static void Main(string[] args)
        {
            /*Exercício 72
            Faça um algoritmo que percorra todos os números de 1 até 100.
            Para os números ímpares, deve ser impresso um “*”, e para os números pares, deve ser impresso dois “@”.*/

            for (int i = 1; i <= 100; i++)
            {
                if (i %2 == 0)
                {
                    Console.WriteLine($"{i} @@ \n");
                }else
                {
                    Console.WriteLine($"{i} * \n");
                }
            }
        }
    }
}
