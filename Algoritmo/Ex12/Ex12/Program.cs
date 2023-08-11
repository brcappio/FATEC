using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex12
{
    class Program
    {
        static void Main(string[] args)
        {
            /*12 – Crie um Algoritmo que receba um número e imprima sua raiz quadrada e suaraizcúbica. SAÍDA:
O número digitado foi ... Sua raiz cúbica é ... Sua raiz quadrada é ..*/

            Console.Write("Digite um número: ");
            double num = double.Parse(Console.ReadLine());

            double squareRoot = Math.Sqrt(num);
            double cubicRoot = Math.Pow(num , (1.0/3));

            Console.WriteLine($"O número digitado foi {num}. Sua raíz quadrada é: {squareRoot} \nE sua raíz cúbica é: {cubicRoot} ");
        }
    }
}
