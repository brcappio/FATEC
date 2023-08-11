using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex39
{
    class Program
    {
        static void Main(string[] args)
        {
            /*Efetuar a leitura de um número e apresentar o resultado do quadrado desse número. Depois verificar se este novo valor é maior que 10.00, menor que 10.00 ou igual a 10.00.
             * Se for maior que 10.00 apresentar também sua Raiz Cúbica.*/

            Console.Write("Digite um número: ");
            double num = double.Parse(Console.ReadLine());

            double quadrado = Math.Pow(num, 2);

            if (quadrado > 10)
            {
                double cubica = Math.Pow(quadrado, 1.0 / 3.0);
                Console.WriteLine($"O valor do quadrado do número digitado ({num}), é {quadrado}, e o valor da raíz cúbica do seu quadrado é {cubica.ToString("F2")}. ");
            } else if (quadrado < 10)
            {
                Console.WriteLine($"O valor do quadrado do número digitado ({num}), é {quadrado}, e esse número é menor que 10.");
            } else
            {
                Console.WriteLine($"O valor do quadrado do número digitado ({num}) é {quadrado}, e esse número é igual a 10.");
            }
        }
    }
}
