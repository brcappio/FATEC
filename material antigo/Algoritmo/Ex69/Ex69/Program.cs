using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex69
{
    class Program
    {
        static void Main(string[] args)
        {
            /*Exercício 69
            Faça um algoritmo que leia dois valores inteiros A e B (maiores que zero).

            Se os valores forem iguais deverá se somar os dois, caso contrário multiplique A por B.
            Ao final de qualquer um dos cálculos deve-se atribuir
            o resultado para uma variável C e mostrar seu conteúdo na tela*/

            Console.Write("Digite um número inteiro maior que zero: ");
            int num1 = int.Parse(Console.ReadLine());
            Console.Write("Digite outro número inteiro maior que zero: ");
            int num2 = int.Parse(Console.ReadLine());

            int C = 0;

            if (num1 > 0 && num2 > 0)
            {
                if (num1 == num2)
                {
                    C = num1 + num2;
                } else
                {
                    C = num1 * num2;
                }

                Console.WriteLine($"O valor da variável C é: {C}");
            } else
            {
                Console.WriteLine("Digite valores inteiros positivos!");
            }
        }
    }
}
