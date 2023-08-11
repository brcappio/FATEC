using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex16
{
    class Program
    {
        static void Main(string[] args)
        {
            /*16 - Elabore um algoritmo que calcule a área de um trapézio qualquer (figurameramente ilustrativa).*/

            Console.Write("Digite o tamanho da base maior: ");
            double baseMaior = double.Parse(Console.ReadLine());

            Console.Write("Digite o tamanho da base menor: ");
            double baseMenor = double.Parse(Console.ReadLine());

            Console.Write("Digite o tamanho da altura: ");
            double altura = double.Parse(Console.ReadLine());

            double area = (((baseMaior + baseMenor) * altura) / 2);

            Console.WriteLine($"A área do trapézio regular com a base maior de tamanho {baseMaior}, a base menor de tamanho {baseMenor} e com a altura de {altura} é {area}");

        }
    }
}
