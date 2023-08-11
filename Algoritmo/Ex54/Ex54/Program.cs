using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex54
{
    internal class Program
    {
        static void Main(string[] args)
        {
            /*Exercício 54
            • Criar um algoritmo que receba dois números e imprima a soma dos valores pares compreendidos entre estes números.*/
            Console.Write("Digite o primeiro número: ");
            int num1 = int.Parse(Console.ReadLine());
            Console.Write("Digite o segundo número: ");
            int num2 = int.Parse(Console.ReadLine());

            int soma = 0;
            int aux = num1;

            for (; aux < num2; aux++)
            {
                if (aux %2 == 0)
                {
                    soma = soma + aux;
                }
            }
            Console.WriteLine($"A soma dos números pares entre o número {num1} e {num2} é: {soma}");
        }
    }
}
