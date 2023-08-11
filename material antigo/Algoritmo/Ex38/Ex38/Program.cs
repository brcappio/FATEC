using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex38
{
    class Program
    {
        static void Main(string[] args)
        {
            /*Em época de pouco dinheiro, os comerciantes estão procurando aumentar suas vendas oferecendo desconto.
             * Faça um algoritmo que possa entrar com o valor de um produto e imprimir o novo valor, tendo em vista que o desconto foi de 9%.
             * O valor do produto não pode ser menor ou igual a zero. */

            Console.Write("Digite o valor do produto: ");
            double valorProduto = double.Parse(Console.ReadLine());

            double valorProdutoDesconto = valorProduto * 0.91;

            if (valorProduto <= 0)
            {
                Console.WriteLine("O valor do produto não pode ser menor ou igual a zero.");
            } else {

                Console.WriteLine($"O valor do produto com desconto é: {valorProdutoDesconto}");
            }
        }
    }
}
