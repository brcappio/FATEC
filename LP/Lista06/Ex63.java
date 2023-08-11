/* Bruno Rosa Cappio
63) Solicite ao usuário a quantidade de termos que ele deseja e imprima a sequência abaixo e a soma dos termos.
* 
1/2 + 1/3 + 2/5 + 3/7 + 5/11 + 8/13 + ...
*/

import java.util.Scanner;

public class Ex63 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite a quantidade de termos da sequência: ");
        int n = leia.nextInt();

        int fib1 = 1;
        int fib2 = 1;
        int primo = 2;

        double soma = 0;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                System.out.print(fib1 + "/" + primo + " ");
                soma += (double) fib1 / primo;
            } else if (i == 2) {
                System.out.print(fib2 + "/" + primo + " ");
                soma += (double) fib2 / primo;
            } else {
                int fibAtual = fib1 + fib2;
                System.out.print(fibAtual + "/" + primo + " ");
                soma += (double) fibAtual / primo;
                fib1 = fib2;
                fib2 = fibAtual;
            }
            primo = proximoPrimo(primo);
        }

        System.out.println("\nSoma dos termos: " + soma);
    }

    public static int proximoPrimo(int n) {
        int candidato = n + 1;
        while (!ehPrimo(candidato)) {
            candidato++;
        }
        return candidato;
    }

    public static boolean ehPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}

