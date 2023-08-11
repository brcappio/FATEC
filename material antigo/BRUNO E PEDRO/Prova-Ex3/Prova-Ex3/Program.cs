using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Prova_Ex3
{
    class Program
    {
        static void Main(string[] args)
        {
            int numero = 0;
            int soma = 0;
            int quantidadeParPositivo = 0;
            int quantidadePositivos = 0;
            int quantidadeNegativos = 0;
            double media = 0;
            double quantidade = 0;

            do
            {
                Console.Write("Digite um número inteiro: ");
                numero = int.Parse(Console.ReadLine());

                soma += numero;
                
                if (numero > 0)
                {
                    quantidade++;
                    quantidadePositivos++;

                    if (numero % 2 == 0)
                    {
                        quantidadeParPositivo++;
                    }
                }

                if (numero < 0)
                {
                    quantidade++;
                    quantidadeNegativos++;
                }

                media = soma / quantidade;

            } while (numero != 0);

            Console.WriteLine($"A soma dos números digitados é: {soma}");
            Console.WriteLine($"A média dos números digitados é: {media}");
            Console.WriteLine($"A quantidade de números pares e positivos digitados é: {quantidadeParPositivo}");
            Console.WriteLine($"A quantidade de números positivos digitados é: {quantidadePositivos}");
            Console.WriteLine($"A quantidade de números negativos digitados é: {quantidadeNegativos}");
        }
    }
}
