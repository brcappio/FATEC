using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex17
{
    class Program
    {
        static void Main(string[] args)
        {
            /*Construa um algoritmo que possa calcular o volume de um prisma de base triangular (figura meramente ilustrativa). Volume = área da base x altura.*/

            Console.Write("Digite o tamanho do lado da base: ");
            double ladoBase = double.Parse(Console.ReadLine());

            Console.Write("Digite o tamanho da altura da base: ");
            double alturaBase = double.Parse(Console.ReadLine());

            Console.Write("Digite o tamanho da altura do prisma: ");
            double alturaPrisma = double.Parse(Console.ReadLine());

            double areaBase = ((ladoBase * alturaBase) / 2);

            double volume = areaBase * alturaPrisma;

            Console.WriteLine($"O volume do prisma de altura: {alturaPrisma}, com base de lado {ladoBase} e altura de {alturaBase} é {volume}");
        }
    }
}
