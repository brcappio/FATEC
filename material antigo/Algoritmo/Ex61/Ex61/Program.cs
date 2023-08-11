using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex61
{
    internal class Program
    {
        static void Main(string[] args)
        {
            /*Exercício 61
            Imprimir em ordem decrescente todos os números múltiplos de 3 e de 5 compreendidos entre 30 e 300.*/
            for (int i = 300; i >= 30; i--)
            {
                if (i %3 == 0 || i %5 == 0)
                {
                    Console.WriteLine(i);
                } 
            }
        }
    }
}
