using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex19
{
    class Program
    {
        static void Main(string[] args)
        {
            /*19 - Elabore um algoritmo que possa calcular o volume de um cilindro (figurameramente ilustrativa).
             * Área da base = área da circunferência
               Volume = área da base x altura*/

            Console.Write("Digite o tamanho do raio do cilindro: ");
            double raio = double.Parse(Console.ReadLine());

            Console.Write("Digite o tamanho da altura do cilindro: ");
            double altura = double.Parse(Console.ReadLine());

            double areaBase = (Math.PI * Math.Pow(raio, 2));

            double volume = areaBase * altura;

            Console.WriteLine($"O volume do cilíndro de raio {raio}, e de altura {altura} é de {volume.ToString("F2")}, e a área da sua base é {areaBase.ToString("F2")}");
        }
    }
}
