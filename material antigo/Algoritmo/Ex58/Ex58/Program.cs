using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex58
{
    internal class Program
    {
        static void Main(string[] args)
        {
            /* Exercício 58
            Faça um programa que receba vários números, calcule e mostre:
            • A soma dos números digitados
            • A quantidade de números digitados
            • A média dos números digitados
            • A média dos números pares
            • Finalize a entrada de dados caso o usuário informe o valor 0.*/

            int num, soma = 0;
            int contador = 0;
            int contadorPar = 0;

            do
            {
                Console.Write("Digite um número: ");
                num = int.Parse(Console.ReadLine());

                if (num > 0)
                {
                    soma = soma + num;
                    contador++;
                }
                if (num %2 == 0)
                {
                    contadorPar = contadorPar + num;
                }
            } while (num > 0);
            Console.WriteLine($"A soma dos números digitados é: {soma}, a quantidade de números digitados é {contador}, a média dos números digitados é {soma/contador}, e a média dos números pares é {contadorPar/contador}");
        }
    }
}
