using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex52
{
    internal class Program
    {
        static void Main(string[] args)
        {
            /*Exercício 52
            • Criar um algoritmo que receba dois números diferentes e imprima os números compreendidos entre estes números, inclusive os números digitados.*/

            Console.Write("Digite o primeiro número: ");
            int num1 = int.Parse(Console.ReadLine());

            Console.Write("Digite o segundo número: ");
            int num2 = int.Parse(Console.ReadLine());

            for (int i = num1; i <= num2; i++)
            {
                Console.WriteLine(i);
            }
        }
    }
}
