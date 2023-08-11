using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex33
{
    class Program
    {
        static void Main(string[] args)
        {
            /*33 - Receber a altura do degrau de uma escada e a altura que o usuário deseja alcançar subindo a escada.
             * Calcular e mostrar quantos degraus o usuário deverá subir para atingir seu objetivo, sem se preocupar com a altura do usuário. */

            Console.Write("Digite a altura do degrau da escada (em metros): ");
            double alturaDegrau = double.Parse(Console.ReadLine());

            Console.Write("Digite a altura que deseja alcançar subindo a escada (em metros): ");
            double alturaFinal = double.Parse(Console.ReadLine());

            double degraus = alturaFinal / alturaDegrau;

            Console.WriteLine($"Para alcançar o objetivo, o usuário deve subir {degraus} degraus");
        }
    }
}
