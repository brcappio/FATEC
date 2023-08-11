using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex30
{
    class Program
    {
        static void Main(string[] args)
        {
            /*30 - Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. 
             * A fórmula de conversão é: F = C *(9.0/5.0) + 32.0, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.*/

            Console.Write("Digite um temperatura em Celsius: ");
            double tempCelsius = double.Parse(Console.ReadLine());

            double tempFahrenheit = tempCelsius * (9.0 / 5.0) + 32.0;

            Console.WriteLine($"A temperatura {tempCelsius} em Fahrenheit é: {tempFahrenheit}");
        }
    }
}
