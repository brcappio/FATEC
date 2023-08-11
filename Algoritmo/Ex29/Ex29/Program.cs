using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex29
{
    class Program
    {
        static void Main(string[] args)
        {
            /*29 - Construir um algoritmo que leia dois valores numéricos e efetue sua adição. - Caso o resultado da adição seja maior que 10, exibir os números digitados, o valor da adição e a raiz cúbica da adição.
             *- Caso contrário exibir somente os valores digitados e o valor da adição.*/

            Console.Write("Insira o primeiro número: ");
            double num1 = double.Parse(Console.ReadLine());

            Console.Write("Insira o segundo número: ");
            double num2 = double.Parse(Console.ReadLine());

            double sum = num1 + num2;

            double cubicRoot = Math.Pow(sum, (1.0 / 3.0));

            if (sum > 10)
            {
                Console.WriteLine($"Os números digitados foram: {num1} e {num2}, a soma dos dois é {sum} e a raíz cúbica de sua adição é {cubicRoot.ToString("F2")}");
            } else
            {
                Console.WriteLine($"Os números digitados foram: {num1} e {num2}, a soma dos dois é {sum}.");
            }
        }
    }
}
