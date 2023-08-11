using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex28
{
    class Program
    {
        static void Main(string[] args)
        {
            /*28 - Ler três números.
             - Exibir os três números informando se eles são positivos, negativos ou nulos.
             - Informar o maior número. */

            Console.Write("Insira o primeiro número: ");
            double num1 = double.Parse(Console.ReadLine());

            Console.Write("Insira o segundo número: ");
            double num2 = double.Parse(Console.ReadLine());

            Console.Write("Insira o terceiro número: ");
            double num3 = double.Parse(Console.ReadLine());

            Console.WriteLine($"\nOs números informados são: {num1}, {num2}, {num3}");

            if (num1 > 0)
            {
                Console.WriteLine($"\nO primeiro número ({num1}) é positivo.");
            } else if (num1 < 0) {
                Console.WriteLine($"\nO primeiro número ({num1}) é negativo.");
            } else
            {
                Console.WriteLine($"\nO primeiro número ({num1}) é nulo.");
            }

            if (num2 > 0)
            {
                Console.WriteLine($"O primeiro número ({num2}) é positivo.");
            }
            else if (num2 < 0)
            {
                Console.WriteLine($"O primeiro número ({num2}) é negativo.");
            }
            else
            {
                Console.WriteLine($"O primeiro número ({num2}) é nulo.");
            }

            if (num3 > 0)
            {
                Console.WriteLine($"O primeiro número ({num3}) é positivo.");
            }
            else if (num3 < 0)
            {
                Console.WriteLine($"O primeiro número ({num3}) é negativo.");
            }
            else
            {
                Console.WriteLine($"O primeiro número ({num3}) é nulo.");
            }
        }
    }
}
