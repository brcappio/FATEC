using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex47
{
    class Program
    {
        static void Main(string[] args)
        {
            /*Exercício 47
            O cardápio de uma lanchonete é o seguinte:
            Código Especificação Preço unitário
            100 Cachorro quente 4,50
            101 Bauru simples 4,50
            102 Bauru c/ovo 5,50
            103 Hambúrguer 6,50
            104 Refrigerante 3,50
            Escrever um algoritmo que leia o código do item pedido, a quantidade e calcule o a ser pago por aquele lanche.
            Considere que a cada execução somente será calculado um item.*/

            Console.Write("100 - Cachorro Quente - Valor: 4.50\n101 - Bauru Simples - Valor: 4.50 \n102 - Bauru c/Ovo \n103 - Hambúrguer - Valor: 6.50\n104 - Refrigerante - Valor: 3.50\n");

            Console.Write("Digite o código do pedido: ");
            int codigo = int.Parse(Console.ReadLine());

            Console.Write("Digite a quantidade desejada: ");
            int quantidade = int.Parse(Console.ReadLine());


            double cachorroQuente = 4.50;
            double bauruSimples = 4.50;
            double bauruOvo = 5.50;
            double hamburguer = 6.50;
            double refrigerante = 3.50;

            switch (codigo)
            {
                case 100:
                    Console.WriteLine($"O valor a ser pago é: {quantidade * cachorroQuente}");
                    break;
                case 101:
                    Console.WriteLine($"O valor a ser pago é: {quantidade * bauruSimples}");
                    break;
                case 102:
                    Console.WriteLine($"O valor a ser pago é: {quantidade * bauruOvo}");
                    break;
                case 103:
                    Console.WriteLine($"O valor a ser pago é: {quantidade * hamburguer}");
                    break;
                case 104:
                    Console.WriteLine($"O valor a ser pago é: {quantidade * refrigerante}");
                    break;
                default:
                    Console.WriteLine("A quantidade deve ser um número inteiro e maior que zero, e o código do ítem desejado deve ser um dos disponíveis.");
                    break;
            }
        }
    }
}
