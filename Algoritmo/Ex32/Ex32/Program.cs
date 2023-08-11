using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex32
{
    class Program
    {
        static void Main(string[] args)
        {
            /*32 - Receber o salário de um funcionário, exibir o valor deste salário, calcular e mostrar seu novo salário, sabendo que ele recebeu um aumento de 25%. */

            Console.Write("Digite o salário do funcionário: ");
            double salario = double.Parse(Console.ReadLine());

            double aumento = salario * 1.25;

            Console.WriteLine($"O salário atual do funcionário é {salario}, e o valor do novo salário, após o aumento recebido é de {aumento}");
        }
    }
}
