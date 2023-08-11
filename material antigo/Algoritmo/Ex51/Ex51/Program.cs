using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex51
{
    internal class Program
    {
        static void Main(string[] args)
        {
            /*Exercício 51
            • Criar um algoritmo que receba um número obrigatoriamente menor que dez e imprima todos os números de vinte até o número digitado.*/

            Console.Write("Digite um número menor que dez e maior que zero: ");
            int num = int.Parse(Console.ReadLine());

            for (int i = 20; i >= num; i--)
            {
                Console.WriteLine(i);
            }
        }
    }
}
