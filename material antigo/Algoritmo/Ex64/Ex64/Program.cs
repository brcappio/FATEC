using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex64
{
    internal class Program
    {
        static void Main(string[] args)
        {
            /*Exercício 64
            Imprimir todos os números ímpares de 1000 até 150 em ordem decrescente.*/
            for (int i = 1000; i >= 150; i--)
            {
                if (i %2 != 0)
                {
                    Console.WriteLine(i);
                }
            }
        }
    }
}
