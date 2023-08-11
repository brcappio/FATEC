using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex57
{
    internal class Program
    {
        static void Main(string[] args)
        {
            /*Exercício 57
            Faça um programa que calcule e mostre a soma dos 50 primeiros números pares positivos.*/

            int soma = 0;

            for(int i = 0; i <= 100; i++)
            {
                if (i %2 == 0)
                {
                    soma = soma + i;
                }
            }
            Console.WriteLine($"A soma dos 50 primeiros números pares é: {soma}");
        }
    }
}
