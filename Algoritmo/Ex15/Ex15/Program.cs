using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex15
{
    class Program
    {
        static void Main(string[] args)
        {
            /*15 - Entrar com os lados A, B e C de um paralelepípedo. 
             * Calcular e imprimir o volume. 
             * • Volume = A * B * C*/

            Console.Write("Digite o tamanho do primeiro lado: ");
            double lado1 = double.Parse(Console.ReadLine());

            Console.Write("Digite o tamanho do segundo lado: ");
            double lado2 = double.Parse(Console.ReadLine());

            Console.Write("Digite o tamanho do terceiro lado: ");
            double lado3 = double.Parse(Console.ReadLine());

            double volume = (lado1 * lado2 * lado3);

            Console.WriteLine($"O volume do paralelepípedo com os lados de tamanho {lado1}, {lado2}, {lado3} é: {volume}");

        }
    }
}
