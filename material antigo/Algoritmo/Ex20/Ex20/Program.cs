using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex20
{
    class Program
    {
        static void Main(string[] args)
        {
            /*Elabore um algoritmo para calcular o volume e a área de uma esfera(figurameramente ilustrativa). 
             * Área = 4 × PI × r²
             * Volume = 4/3 × PI × r³*/

            Console.Write("Digite o tamanho do raio: ");
            double raio = double.Parse(Console.ReadLine());

            double area = (4 * Math.PI * Math.Pow(raio, 2));
            double volume = ((4 * Math.PI * Math.Pow(raio, 3))/3);

            Console.WriteLine($"O volume da esfera de raio {raio} é {volume.ToString("F2")} e a sua área é {area.ToString("F2")}");
        }
    }
}
