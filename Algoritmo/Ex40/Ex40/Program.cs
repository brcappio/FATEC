using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex40
{
    class Program
    {
        static void Main(string[] args)
        {
            /*Construir um algoritmo que leia dois valores numéricos e efetue sua adição.
             * Caso o resultado da adição seja maior que 10, exibir os números digitados, o valor da adição e a raiz cúbica da adição.
             * Caso contrário exibir somente os valores digitados e o valor da adição. */

            Console.Write("Digite o primeiro número: ");
            double num1 = double.Parse(Console.ReadLine());
            Console.Write("Digite o segundo número: ");
            double num2 = double.Parse(Console.ReadLine());

            double soma = num1 + num2;

            if (soma > 10)
            {
                double cubica = Math.Pow(soma, 1.0 / 3.0);
                Console.WriteLine($"Os números digitados foram: {num1} e {num2}, o valor da sua adição é {soma}, e a raíz cubica da sua adição é {cubica.ToString("F2")}");
            } else
            {
                Console.WriteLine($"Os números digitados foram: {num1} e {num2}, o valor da sua adição é {soma}.");
            }
        }
    }
}
