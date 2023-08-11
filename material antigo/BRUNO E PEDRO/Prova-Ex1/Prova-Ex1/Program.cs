using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Prova_Ex1
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Digite o primeiro número: ");
            int numero1 = int.Parse(Console.ReadLine());

            Console.Write("Digite o segundo número: ");
            int numero2 = int.Parse(Console.ReadLine());

            Console.Write("Digite o terceiro número: ");
            int numero3 = int.Parse(Console.ReadLine());

            if (numero1 == numero2 && numero1 == numero3 && numero2 == numero3)
            {
                Console.WriteLine($"O maior número é: {numero1}");
                Console.WriteLine($"O menor número é: {numero2}");
                Console.WriteLine($"Os números em ordem decrescente são: {numero1}, {numero2}, {numero3}");
            }

            if (numero1 > numero2 && numero1 > numero3)
            {
                Console.WriteLine($"O maior número é: {numero1}");

                if (numero2 > numero3)
                {
                    Console.WriteLine($"O menor número é: {numero3}");
                    Console.WriteLine($"Os números em ordem decrescente são: {numero1}, {numero2}, {numero3}");
                }
                else
                {
                    Console.WriteLine($"O menor número é: {numero2}");
                    Console.WriteLine($"Os números em ordem decrescente são: {numero1}, {numero3}, {numero2}");
                }

            }
            if (numero2 > numero1 && numero2 > numero3)
            {
                Console.WriteLine($"O maior número é: {numero2}");

                if (numero1 > numero3)
                {
                    Console.WriteLine($"O menor número é: {numero3}");
                    Console.WriteLine($"Os números em ordem decrescente são: {numero2}, {numero1}, {numero3}");
                }
                else
                {
                    Console.WriteLine($"O menor número é: {numero1}");
                    Console.WriteLine($"Os números em ordem decrescente são: {numero2}, {numero3}, {numero1}");
                }
            }
            if (numero3 > numero1 && numero3 > numero2)
            {
                Console.WriteLine($"O maior número é: {numero3}");

                if (numero2 > numero1)
                {
                    Console.WriteLine($"O menor número é: {numero1}");
                    Console.WriteLine($"Os números em ordem decrescente são: {numero3}, {numero2}, {numero1}");
                }
                else
                {
                    Console.WriteLine($"O menor número é: {numero2}");
                    Console.WriteLine($"Os números em ordem decrescente são: {numero3}, {numero1}, {numero2}");
                }
            }
        }
    }
}
