using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex74
{
    class Program
    {
        static void Main(string[] args)
        {
            /*Exercício 74
            Entrar com 10 números e imprimir a metade de cada número.*/

            int contador = 0;

            do
            {
                Console.Write("Digite um número: ");
                double num = int.Parse(Console.ReadLine());
                double metade = num / 2;

                Console.WriteLine($"A metade do número é: {metade}");
                contador++;

            } while (contador < 10);
        }
    }
}
