using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex8Area
{
    class Program
    {
        static void Main(string[] args)
        {
            /*Elabore um algoritmo que calcule a área e o perímetro de um quadrado. Área = lado2 
             * Perímetro = é a soma de todos os lados*/

            Console.Write("Digite tamanho do lado do quadrado (em metros): ");
            double lado = double.Parse(Console.ReadLine());

            double area = Math.Pow(lado, 2);

            double perim = lado + lado + lado + lado;

            Console.WriteLine("A área do quadrado é: " + area + "m²" +  " e o perímetro é " + perim + "m");
        }
    }
}
