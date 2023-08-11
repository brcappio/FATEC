using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex48
{
    class Program
    {
        static void Main(string[] args)
        {
            /* Exercício 48
             Um professor deseja um algoritmo pelo qual possa escolher que tipo de média deseja calcular a partir de três notas.
             Faça um algoritmo que leia as notas, a opção escolhida pelo usuário e calcule a média
             1- aritmética
             2- ponderada (pesos 3, 3, 4) */

            Console.Write("Digite a primeira nota: ");
            double nota1 = double.Parse(Console.ReadLine());

            Console.Write("Digite a segunda nota: ");
            double nota2 = double.Parse(Console.ReadLine());

            Console.Write("Digite a terceira nota: ");
            double nota3 = double.Parse(Console.ReadLine());

            Console.WriteLine("Escolha o tipo de média desejada: \n1- Aritmética\n2- Ponderada");
            int escolha = int.Parse(Console.ReadLine());

            int peso1 = 3;
            int peso2 = 3;
            int peso3 = 4;
            double mediaAritmetica = (nota1 + nota2 + nota3) / 3;
            double mediaPonderada = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1+peso2+peso3);

            switch (escolha)
            {
                case 1:
                    Console.WriteLine($"A média aritmética das notas {nota1}, {nota2}, {nota3} é: {mediaAritmetica}");
                    break;
                case 2:
                    Console.WriteLine($"A média ponderada das notas {nota1}, {nota2}, {nota3}, com os respectivos pesos sendo {peso1}, {peso2} e {peso3} é: {mediaPonderada}");
                    break;
                default:
                    Console.WriteLine("Por favor, escolha uma das duas opções!");
                    break;
            }
        }
    }
}
