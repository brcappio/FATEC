using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex67
{
    class Program
    {
        static void Main(string[] args)
        {
            /*Exercício 67
            Crie um algoritmo que, dado dois números informados pelo usuário
            (obrigatoriamente maior que zero e menor ou igual a cem), 
            e informe qual é o menor deles.*/

            int num1, num2, menor = 0;

            Console.Write("Digite um número maior que zero e menor ou igual a cem: ");
            num1 = int.Parse(Console.ReadLine());
            Console.Write("Digite outro número maior que zero e menor ou igual a cem: ");
            num2 = int.Parse(Console.ReadLine());

            if (num1 > 0 && num1 <= 100 && num2 > 0 && num2 <= 100)
            { 
                if (num1 > num2)
                {
                    menor = num2;
                } else
                {
                    menor = num1;
                }
            }

            Console.WriteLine($"O menor número é: {menor}");
        }
    }
}
