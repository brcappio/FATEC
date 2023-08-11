using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex36
{
    class Program
    {
        static void Main(string[] args)
        {
            /* Criar um algoritmo que calcule e imprima a área de um losango.
             * Se os valores de entrada forem negativos ou iguais a zero o algoritmo deve imprimir uma mensagem de erro
             * - “Valores inválidos”.
             * Área = ( D * d ) / 2 */

            Console.Write("Digite o tamanho da diagonal maior: ");
            double diagonalMaior = double.Parse(Console.ReadLine());

            Console.Write("Digite o tamanho da diagonal menor: ");
            double diagonalMenor = double.Parse(Console.ReadLine());

            double area = (diagonalMaior * diagonalMenor) / 2;

            if (diagonalMaior <= 0 && diagonalMenor <= 0)
            {
                Console.WriteLine("Valores inválidos.");
            } else
            {
                Console.WriteLine($"O valor da área é: {area}");
            }
        }
    }
}
