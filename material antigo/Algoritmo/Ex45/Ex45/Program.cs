using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex45
{
    class Program
    {
        static void Main(string[] args)
        {
            /*Exercício 45
            Calculando o IMC – Índice de Massa Corporal
            Para calcular o índice de massa corporal basta utiliza
            a fórmula abaixo e comparar o resultado com a tabela abaixo.
              IMC = peso/altura² */

            /* Entre 17 e 18,49 Abaixo do peso
            Entre 18,5 e 24,99 Peso normal
            Entre 25 e 29,99 Acima do peso
            Entre 30 e 34,99 Obesidade I
            Entre 35 e 39,99 Obesidade II (severa)
            Acima de 40 Obesidade III (mórbida) */

            Console.Write("Digite a altura (em metros): ");
            double altura = double.Parse(Console.ReadLine());

            Console.Write("Digite o peso (em kilos): ");
            double peso = double.Parse(Console.ReadLine());

            double imc = peso / Math.Pow(altura, 2);

            if (imc < 17)
            {
                Console.WriteLine("Muito abaixo do peso.");
            } if (imc >= 18.5 && imc <= 24.99 ) {
                Console.WriteLine("Peso normal.");
            } if (imc >= 25 && imc <= 29.99 ) {
                Console.WriteLine("Acima do peso.");
            } if (imc >= 30 && imc <= 34.99 ) {
                Console.WriteLine("Obesidade I.");
            } if (imc >= 35 && imc <= 39.99 ) {
                Console.WriteLine("Obesidade II (severa).");
            } if (imc >= 40) {
                Console.WriteLine("Obesidade III (mórbida).");
            } else if (peso < 0 && altura < 0)
            {
                Console.WriteLine("Os números não podem ser nulos ou negativos!");
            }
        }
    }
}
