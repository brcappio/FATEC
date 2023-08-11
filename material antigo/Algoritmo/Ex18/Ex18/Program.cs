using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex18
{
    class Program
    {
        static void Main(string[] args)
        {
            /*18 - Crie um algoritmo que possa calcular a área de uma coroa de forma circular (figurameramente ilustrativa).
             * Área da circunferência = PI * raio²
               Área = (Área da circunferência Maior) – (Área da circunferência menor)*/

            Console.Write("Digite o tamanho do raio maior: ");
            double raioMaior = double.Parse(Console.ReadLine());

            Console.Write("Digite o tamanho do raio menor: ");
            double raioMenor = double.Parse(Console.ReadLine());

            double areaMaior = (Math.PI * Math.Pow(raioMaior, 2));
            double areaMenor = (Math.PI * Math.Pow(raioMenor, 2));

            double areaCoroa = (areaMaior - areaMenor);

            Console.WriteLine($"A área da coroa com raio maior de {raioMaior} e de raio menor de {raioMenor} é de {areaCoroa.ToString("F2")}");
        }
    }
}
