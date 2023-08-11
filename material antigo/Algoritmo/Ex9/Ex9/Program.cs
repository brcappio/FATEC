using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex9
{
    class Program
    {
        static void Main(string[] args)
        {
            /*Elabore um algoritmo que calcule a área e o perímetro de um retângulo. Área = b x h
Perímetro = é a soma de todos os lados*/

            Console.Write("Digite o tamanho da base (em metros): ");
            double tamanhoBase = double.Parse(Console.ReadLine()); 

            Console.Write("Digite o tamanho da altura (em metros): ");
            double tamanhoAltura = double.Parse(Console.ReadLine());

            double perimetro = (tamanhoBase * 2) + (tamanhoAltura * 2);

            double area = (tamanhoAltura * tamanhoBase);

            Console.WriteLine("O área do retângulo é: " + area + "m²" + "e o perímetro é: " + perimetro + "m");

        }
    }
}
