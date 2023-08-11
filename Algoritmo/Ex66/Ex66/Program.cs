using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex66
{
    internal class Program
    {
        static void Main(string[] args)
        {
            /*Criar um algoritmo que leia um número que será o limite superior de um intervalo e o incremento.
            Imprimir todos os números no intervalo de 0 até esse número.
            Suponha que os dois números lidos são obrigatoriamente maiores que zero.
            Exemplo:
            • Limite superior: 20
            • Incremento: 5
            • Saída: 0, 5, 10, 15, 20*/

            Console.Write("Digite um limite: ");
            int limite = int.Parse(Console.ReadLine());
            Console.Write("Digite o incremento: ");
            int incremento = int.Parse(Console.ReadLine());

            for (int i = 0; i <= limite; i = i + incremento)
            {
                Console.WriteLine(i);
            }
        }
    }
}
