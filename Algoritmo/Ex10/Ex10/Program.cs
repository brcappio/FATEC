using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex10
{
    class Program
    {
        static void Main(string[] args)
        {
            /* 10- Crie um Algoritmo que receba um número e imprima sua raiz quadrada. SAÍDA:
A raiz quadrada de no número .... é ... */
            Console.Write("Digite um número: ");
            double num = double.Parse(Console.ReadLine());

            double root = Math.Sqrt(num);

            Console.WriteLine("A raiz quadrada de " + num + " é " + root);

        }
    }
}
