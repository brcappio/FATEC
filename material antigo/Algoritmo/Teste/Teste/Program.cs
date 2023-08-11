// See https://aka.ms/new-console-template for more information
Console.Write("Digite o primeiro número: ");
int n1 = int.Parse(Console.ReadLine());

Console.Write("Digite o segundo número ");
int n2 = int.Parse(Console.ReadLine());


int num = 0;
int aux = 0;
int contador = 0;

if (n1 != n2 && n1 > 0 && n2 > 0)
{
    if (n2 > n1)
    {
        aux = n1;
        n1 = n2;
        n2 = aux;
    }
}

for (int i = 2; i <= n1 / 2; i++)
{
    if (num % i == 0)
    {
        contador++;
    }
}

Console.Write($"A quantidade de números primos compreendida entre {n2} e {n1} é: {contador}");
