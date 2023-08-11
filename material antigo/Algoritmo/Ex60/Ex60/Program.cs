using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex60
{
    internal class Program
    {
        static void Main(string[] args)
        {
            /*Exercício 60
            Imprimir todos os números pares , múltiplos de 5 e 7 de 1 até 100.
            Imprimir também a soma destes números. */

            int soma = 0;
            for (int i = 1; i <= 100; i++)
            {
                if (i % 2 == 0 && i %5 == 0 && i %7 == 0)
                {
                    Console.WriteLine(i);
                    soma = soma + i;
                }
            }
            Console.WriteLine($"A soma dos números pares de 1 a 100, que são múltiplos de 5, 7 é: {soma}");
        }
    }
}
