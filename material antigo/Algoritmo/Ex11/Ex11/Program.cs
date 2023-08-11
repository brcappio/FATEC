using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex11
{
    class Program
    {
        static void Main(string[] args)
        {
            /*11 – Crie um Algoritmo que receba um número e imprima seu valor elevadoa2, elevado a 3, elevado a 4 e elevado a 5. SAÍDA:
O número digitado foi ... E seu valor elevado a 2 é ..., elevado a 3 é ..., ...*/

            Console.Write("Digite um número: ");
            double num = double.Parse(Console.ReadLine());

            double num2 = Math.Pow(num, 2);
            double num3 = Math.Pow(num, 3);
            double num4 = Math.Pow(num, 4);
            double num5 = Math.Pow(num, 5);

            Console.WriteLine("O número digitado foi: " + num +

                "\nO número digitado ao quadrado é: " + num2 +

                "\nO número digitado elevado a terceira potência é: " + num3 +

                "\nO número digitado elevado a quarta potência é: " + num4 +

                "\nO número digitado elevado a quinta potência é: " + num5);
        }
    }
}
