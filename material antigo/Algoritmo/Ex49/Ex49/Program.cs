using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex49
{
    class Program
    {
        static void Main(string[] args)
        {
            /* Exercício 49
            • Criar um algoritmo para imprimir a soma de todos os números de 0 à 100.*/

            int inicial = 0;
            int soma = 0;
            while (inicial < 100)
            {
                inicial++;
                soma = soma + inicial;
            }
                Console.WriteLine(soma);
        }
    }
}
