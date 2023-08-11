using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex59
{
    internal class Program
    {
        static void Main(string[] args)
        {
            /*Exercício 59
            Faça um programa que some todos os números abaixo de 1000 que são múltiplos de 3 e de 5. */

            int soma = 0;

            for (int i = 0; i <= 1000; i++)
            {
                if (i %3 == 0 && i %5 == 0)
                {
                    soma = soma + i;
                }
            }
            Console.WriteLine($"A soma dos números abaixo de 1000 que são múltiplos de 3 e de 5 é: {soma}");
        }
    }
}
