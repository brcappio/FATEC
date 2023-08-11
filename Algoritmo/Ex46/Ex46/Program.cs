using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex46
{
    class Program
    {
        static void Main(string[] args)
        {
            /* Uma sorveteria vende três tipos de picolés.
             * Sabendo-se que o picolé do tipo 1 é vendido por R$ 1.50, o do tipo 2 por R$2.60
             * e o do tipo 3 por R$ 3.75, faça um algoritmo que receba a quantidade
             * comprada e o tipo do picolé (1, 2 ou 3) e imprima a quantidade vendida, o tipo, o preço e o total arrecadado.*/

            Console.Write("Digite o tipo de picolé: \n1- Picolé tipo 1\n2- Picolé tipo 2\n3- Picolé tipo 3");
            int tipo = int.Parse(Console.ReadLine());
            Console.WriteLine("Digite a quantidade de picolés que deseja comprar: ");
            double quantidade = double.Parse(Console.ReadLine());

            double picole1 = 1.5;
            double picole2 = 2.6;
            double picole3 = 3.75;

            if (tipo == 1)
            {
                Console.WriteLine($"A quantidade vendida é: {quantidade}, o tipo escolhido é {tipo} e o preço total é {quantidade * picole1}");
            }
            else if (tipo == 2)
            {
                Console.WriteLine($"A quantidade vendida é: {quantidade}, o tipo escolhido é {tipo} e o preço total é {quantidade * picole2}");
            } else
            {
                Console.WriteLine($"A quantidade vendida é: {quantidade}, o tipo escolhido é {tipo} e o preço total é {quantidade * picole3}");
            }
        }
    }
}
