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
            /*Exercício 37
            Conhecendo a diagonal maior e a diagonal menor de um losango regular, calcular o valor de seu lado.
            Atenção: Os valores não podem ser negativos ou iguais a zero.*/

            Console.Write("Digite o tamanho da diagonal maior: ");
            double diagonalMaior = double.Parse(Console.ReadLine());

            Console.Write("Digite o tamanho da diagonal menor: ");
            double diagonalMenor = double.Parse(Console.ReadLine());

            double metadeDiagMaior = (diagonalMaior / 2);
            double metadeDiagMenor = (diagonalMenor / 2);

            double lado = Math.Sqrt(Math.Pow(metadeDiagMaior,2) + Math.Pow(metadeDiagMenor,2));

            if (diagonalMaior <= 0 && diagonalMenor <= 0)
            {
                Console.WriteLine("Valores inválidos.");
            }
            else
            {
                Console.WriteLine($"O valor do lado é: {lado}");
            }
        }
    }
}
