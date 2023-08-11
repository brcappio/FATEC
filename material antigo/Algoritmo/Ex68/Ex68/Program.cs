using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex68
{
    class Program
    {
        static void Main(string[] args)
        {
            /*Exercício 68
            Crie um algoritmo que, dado o nível de alerta de risco, imprima se ele for GRAVE.
            O nível de alerta é um número que varia de 0 a 10.
            O nível é considerado GRAVE quando ele é superior a 9.*/

            int alerta = 0;

            do
            {
                Console.Write("Digite o nível de alerta (0 a 10): ");
                alerta = int.Parse(Console.ReadLine());
                if (alerta > 0 && alerta <= 10) {
                    Console.WriteLine($"O nível é de alerta é {alerta}.");
                }

                if (alerta >= 9 && alerta <= 10)
                {
                    Console.WriteLine("O nível é GRAVE!!");
                }
            } while (alerta < 10 && alerta > 0);
        }
    }
}
