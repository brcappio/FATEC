using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex56
{
    internal class Program
    {
        static void Main(string[] args)
        {
            /*Exercício 56
             * Criar um algoritmo que entre com cinco números e imprima o quadrado de cada número.*/

            for (int i = 0; i < 5; i++)
            {
                Console.Write("Digite um número: ");
                int num = int.Parse(Console.ReadLine());
                Console.WriteLine($"A raíz quadradada do número {num} é {Math.Sqrt(num)}");
            }
        }
    }
}
