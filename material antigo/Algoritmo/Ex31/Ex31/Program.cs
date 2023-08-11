using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex31
{
    class Program
    {
        static void Main(string[] args)
        {
            /*31 - Efetuar a leitura de três valores e apresentar como resultado final a soma dos quadrados dos três valores lidos.
             * Apresentar também se a soma é um número par ou ímpar.*/

            Console.Write("Digite o primeiro número: ");
            double num1 = double.Parse(Console.ReadLine());

            Console.Write("Digite o segundo número: ");
            double num2 = double.Parse(Console.ReadLine());

            Console.Write("Digite o terceiro número: ");
            double num3 = double.Parse(Console.ReadLine());

            double quadrado1 = Math.Pow(num1, 2); 
            double quadrado2 = Math.Pow(num2, 2);
            double quadrado3 = Math.Pow(num3, 2);

            double somaQuadrados = quadrado1 + quadrado2 + quadrado3;

            if ((somaQuadrados % 2) == 0)
            {
                Console.WriteLine($"A soma do quadrado dos números é {somaQuadrados} e este número é par.");
            } else
            {
                Console.WriteLine($"A soma do quadrado dos números é {somaQuadrados} e este número é ímpar.");
            }
        }
    }
}
