using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex41
{
    class Program
    {
        static void Main(string[] args)
        {
            /*Receber o salário de um funcionário, exibir o valor deste salário,
             * calcular e mostrar seu novo salário, sabendo que ele recebeu um aumento de 25%.*/

            Console.Write("Digite o valor do salário do funcionário: ");
            double salario = double.Parse(Console.ReadLine());

            double salarioAumento = salario * 1.25;

            Console.WriteLine($"O valor do salário digitado é: {salario}. E após o aumento de 25%, o salário passa a valer {salarioAumento}");
        }
    }
}
