using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex65
{
    internal class Program
    {
        static void Main(string[] args)
        {
            /* Criar um algoritmo que imprima uma tabela de conversão de polegadas para centímetros.
             * Deseja-se que na tabela conste valores de 1 polegada até 20 polegadas inteiras.
             * Cada polegada possui 25,4 mm.*/

            for (int i = 0; i <= 20; i++)
            {
                double convertido = i * 2.54;
                Console.WriteLine($"{i} Polegadas = {convertido}cm");
            }
        }
    }
}
