using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Prova_Ex2
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Digite o primeiro número: ");
            int numero1 = int.Parse(Console.ReadLine());

            Console.Write("Digite o segundo número: ");
            int numero2 = int.Parse(Console.ReadLine());

            double produto = 1;

            for(; numero2 > numero1; numero1++)
            {
                if (numero1 %2 != 0 && numero1 %3 == 0)
                {
                    produto = produto * numero1;
                }
            }
            for (; numero1 > numero2; numero2++)
            {
                if (numero2 % 2 != 0 && numero2 % 3 == 0)
                {
                    produto = produto * numero2;
                }
            }

            Console.WriteLine($"O produto dos números ímpares e múltiplos de 3, compreendidos entre os números digitados é: {produto}");

        }
    }
}
