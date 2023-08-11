using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex42
{
    class Program
    {
        static void Main(string[] args)
        {
            /*Algoritmo CALCULADORA SIMPLES

            - Em um primeiro momento o algoritmo deve perguntar ao usuário que tipo de operação ele deseja efetuar:
            - Soma;
            - Subtração;
            - Divisão;
            - Multiplicação.
            - Em um segundo momento o algoritmo deve solicitar que o usuário digite dois número e exibir o resultado desejado.
            Cuidado com as divisões que tenham como denominador o número zero.*/

            Console.Write("Digite a operação desejada: \n1- Soma\n2- Subtração\n3- Multiplicação\n4- Divisão\n");
            int numCase = int.Parse(Console.ReadLine());

            Console.Write("Digite o primeiro número: ");
            double num1 = double.Parse(Console.ReadLine());

            Console.Write("Digite o segundo número: ");
            double num2 = double.Parse(Console.ReadLine());

            switch(numCase)
            {
                case 1:
                    double soma = num1 + num2;
                    Console.WriteLine($"O resultado da soma dos números digitados é: {soma}");
                    break;

                case 2:
                    double sub = num1 - num2;
                    Console.WriteLine($"O resultado da subtração dos números digitados é: {sub}");
                    break;

                case 3:
                    double multi = num1 * num2;
                    Console.WriteLine($"O resultado da multiplicação dos números digitados é: {multi}");
                    break;

                case 4:
                    double div = num1 / num2;
                    Console.WriteLine($"O resultado da divisão dos números digitados é: {div}");
                    break;
            }
        }
    }
}
