using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex44
{
    class Program
    {
        static void Main(string[] args)
        {
            /*- Entrar com o nome e duas notas de um aluno.
             * - As notas vão de zero a dez.
             * O algoritmo deve imprimir o nome do aluno, suas notas e sua média.
             * - Se a nota for maior que 7 – imprimir “Aprovado”.
             * - Se a nota for menor que 5 – imprimir “Retido”.
             * - Caso contrário - imprimir “Recuperação”.
             * - Se as notas não estiverem no intervalo estabelecido o algoritmo deve emitir uma mensagem de erro.*/

            Console.Write("Digite o primeiro nome do aluno: ");
            string nome = Console.ReadLine();

            Console.Write("Digite a primeira nota: ");
            double nota1 = double.Parse(Console.ReadLine());

            Console.Write("Digite a segunda nota: ");
            double nota2 = double.Parse(Console.ReadLine());

            double media = ((nota1 + nota2) / 2);

            Console.WriteLine($"O aluno {nome} possui notas {nota1} e {nota2}, e a média de suas notas é {media}");

            if (media < 5)
            {
                Console.WriteLine("O aluno está retido.");
            } else if (media > 7)
            {
                Console.WriteLine("O aluno está aprovado.");
            } else if (media == 6)
            {
                Console.WriteLine("O aluno está de recuperação.");
            } else
            {
                Console.WriteLine("ERRO!! As notas não estão no intervalo entre 0 e 10.");
            }
        }
    }
}
