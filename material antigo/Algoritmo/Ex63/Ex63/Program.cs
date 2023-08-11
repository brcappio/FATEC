using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex63
{
    internal class Program
    {
        static void Main(string[] args)
        {
            /*Criar um algoritmo que imprima a soma dos números ímpares de 1 a 200.*/
            int soma = 0;
            for (int i = 1; i <= 200; i++)
            {
                if (i %2 != 0)
                {
                    soma = soma + i;
                }
            }
            Console.WriteLine(soma);
        }
    }
}
