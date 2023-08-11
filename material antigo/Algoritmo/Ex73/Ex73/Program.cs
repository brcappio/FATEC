using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex73
{
    class Program
    {
        static void Main(string[] args)
        {
            /*Exercício 73
            Faça um algoritmo que percorra todos os números de 1 até 100.
            Para os números múltiplos de 4, imprima a palavra “PI” e para os outros imprima o próprio número.*/

            for (int i = 1; i <= 100; i++)
            {
                if (i %4 == 0)
                {
                    Console.WriteLine($"{i} PI \n");
                } else
                {
                    Console.WriteLine($"{i} \n");
                }
            }
        }
    }
}
