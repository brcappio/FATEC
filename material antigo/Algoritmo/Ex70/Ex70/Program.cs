using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex70
{
    class Program
    {
        static void Main(string[] args)
        {
            /*Exercício 70
            Faça um algoritmo que leia uma variável e some 5 ao número caso ele seja par ou some 8 caso seja ímpar.
            Deve-se imprimir o resultado desta operação.*/


            Console.Write("Digite um número: ");
            int num = int.Parse(Console.ReadLine());

            if (num % 2 == 0)
            {
                num = num + 5;
                Console.WriteLine($"O resultado da operação é {num}");
            }
            else
            {
                num = num + 8;
                Console.WriteLine($"O resultado da operação é {num}");
            }
        }
    }
}
