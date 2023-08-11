using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex71
{
    class Program
    {
        static void Main(string[] args)
        {
            /*Exercício 71
            Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um algoritmo que calcule
            seu peso ideal, utilizando as seguintes fórmulas:
            • para homens: (72.7 * h) – 58;
            • para mulheres: (62.1 * h) – 44.7.*/

            Console.Write("Digite sua altura (utilize a vírgula): ");
            double altura = double.Parse(Console.ReadLine());

            Console.Write("Digite 1 para Masculino ou 2 para Feminino: ");
            int sexo = int.Parse(Console.ReadLine());

            double calculo = 0;

            if (sexo > 0 && sexo < 3)
            {
                if (sexo == 1)
                {
                    calculo = (72.7 * altura) - 58;
                    Console.WriteLine($"O seu peso ideal é: {calculo}");
                } else
                {
                    calculo = (62.1 * altura) - 44.7;
                    Console.WriteLine($"O seu peso ideal é: {calculo}");
                }
            } else
            {
                Console.WriteLine("Escolha 1 ou 2!");
            }
        }
    }
}
