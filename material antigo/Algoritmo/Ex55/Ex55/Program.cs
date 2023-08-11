using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex55
{
    internal class Program
    {
        static void Main(string[] args)
        {
            /*Exercício 55
            Elabore um programa que faça leitura de vários números inteiros, até que se digite um número negativo.
            O programa tem que retornar o maior e o menor número lido. */

            int maior = 0;
            int menor = 0;
            int num = 0;

            while (num >= 0)
            {
                Console.Write("Digite um número: ");
                num = int.Parse(Console.ReadLine());
                if (num > maior)
                {
                    maior = num;
                }
                if (num < menor)
                {
                    menor = num;
                }
            }
            Console.WriteLine($"O maior número digitao foi: {maior} e o menor foi {menor}");
        }
    }
}
