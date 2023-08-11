using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex43
{
    class Program
    {
        static void Main(string[] args)
        {
            /*Entrar com um número qualquer.
             * - Se o número for positivo, imprimir o número digitado e sua raiz quadrada.
             * - Se o número for negativo, imprimir o número digitado e seu valor elevado ao quadrado. */

            Console.Write("Digite um número: ");
            double num = double.Parse(Console.ReadLine());

            if (num > 0)
            {
                double raiz = Math.Sqrt(num);
                Console.WriteLine($"O número digitado foi {num} e sua raíz quadrada é: {raiz}");
            } else if (num < 0)
            {
                double quadrado = Math.Pow(num,2);
                Console.WriteLine($"O número digitado foi {num} e seu valor elevado ao quadrado é: {quadrado}");
            } else
            {
                Console.WriteLine("Zero não vale kkkkkk");
            }
        }
    }
}
