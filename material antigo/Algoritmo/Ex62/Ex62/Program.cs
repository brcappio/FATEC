using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex62
{
    internal class Program
    {
        static void Main(string[] args)
        {
            /*Exercício 62
            Ler dois números e imprimir todos os números pares e múltiplos de 7 compreendidos entre os números digitados pelo usuário.
            Atenção: o usuário pode digitar o primeiro número menor que o segundo e vice-versa.*/

            Console.Write("Digite o primeiro número: ");
            int num1 = int.Parse(Console.ReadLine());
            Console.Write("Digite o segundo número: ");
            int num2 = int.Parse(Console.ReadLine());

            
            if (num1 < num2)
            {
                int aux = num1;
                for (;aux <= num2; aux++)
                {
                    if (aux %2 == 0 && aux %7 == 0)
                    {
                        Console.WriteLine(aux);
                    }
                }
            } else if (num1 > num2)
            {
                int aux = num1;
                for (;aux >= num2; aux--)
                {
                    if (aux % 2 == 0 && aux % 7 == 0)
                    {
                        Console.WriteLine(aux);
                    }
                }
            }
        }
    }
}
