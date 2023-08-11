using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex53
{
    internal class Program
    {
        static void Main(string[] args)
        {
            /*Exercício 53
            • Criar um algoritmo que receba dois números e imprima a soma dos valores compreendidos entre estes números, inclusive os números digitados. */

            Console.Write("Digite o primeiro número: ");
            int num1 = int.Parse(Console.ReadLine());
            Console.Write("Digite o segundo número: ");
            int num2 = int.Parse(Console.ReadLine());

            int soma = 0;
            int aux = num1;

            while (aux <= num2)
            {
                soma = soma + aux;
                aux++;
            }
            Console.WriteLine($"A soma dos numéros entre {num1} e {num2} é: {soma}");
        }
    }
}
