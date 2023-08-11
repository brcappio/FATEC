using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex13
{
    class Program
    {
        static void Main(string[] args)
        {
            /*13 – Entrar com quatro números e imprimir a média ponderada, sabendo-se que os pesos são respectivamente 1, 2, 3 e 4.*/

            Console.Write("Digite o primeiro número: ");
            double num1 = double.Parse(Console.ReadLine());

            Console.Write("Digite o segundo número: ");
            double num2 = double.Parse(Console.ReadLine());

            Console.Write("Digite o terceiro número: ");
            double num3 = double.Parse(Console.ReadLine());

            Console.Write("Digite o quarto número: ");
            double num4 = double.Parse(Console.ReadLine());

            double media = ((num1 * 1) + (num2 * 2) + (num3 * 3) + (num4 * 4)) / (1 + 2 + 3 + 4);

            Console.WriteLine($"A média ponderada dos números digitados é: {media}");

        }
    }
}
