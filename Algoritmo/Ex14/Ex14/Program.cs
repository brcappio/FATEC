using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex14
{
    class Program
    {
        static void Main(string[] args)
        {
            /*14- Elabore um algoritmo que entre com valor do raio e calcule a área e o perímetro do círculo correspondente.
             * • A fórmula para se calcular a área da circunferência é :
             * A= π∗ raio2
             * • A fórmula para se calcular o perímetro da circunferência é :
             * A=2∗π ∗ r*/

            Console.Write("Digite o valor do raio: ");
            double raio = double.Parse(Console.ReadLine());

            double area = (Math.PI * Math.Pow(raio, 2));

            double perim = ((Math.PI * 2) * (Math.Pow(raio, 2)));

            Console.WriteLine($"A área do círculo com o raio {raio} é {area.ToString("F2")} e o perímetro é {perim.ToString("F2")}");
        }
    }
}
