/*
 * 2) [POO-015] Crie um programa de conversão de temperaturas em Celsius para Fahrenheit e vice-versa. O
usuário deverá escolher se o valor de temperatura que será informado em Celsius ou em Fahrenheit. Se a
entrada for em Celsius, a saída deverá ser em Fahrenheit e o contrário, também, é verdade. O processo de
conversão deverá ser feito através de um ou mais métodos que recebe a temperatura fornecida como
parâmetro de entrada e retorne a temperatura convertida. Para os cálculos de conversão, utilize as
fórmulas C = 5 * (F - 32) / 9 e F = (9 * C / 5) + 32. O programa deve ser executado enquanto o usuário
desejar.
* 
Entrada: 										Saída: 						Cálculo:
[C]Celsius, [F] Fahrenheit e [S] Sair: V
Opção Inválida!
* 
[C]Celsius, [F] Fahrenheit e [S] Sair: C
Entre com a temperatura: 0 						Saída: 32 					[ F = (9 * 0 / 5) + 32 ]

[C]Celsius, [F] Fahrenheit e [S] Sair: S
* 
[C]Celsius, [F] Fahrenheit e [S] Sair: S
* 
[C]Celsius, [F] Fahrenheit e [S] Sair: C
Entre com a temperatura: 100 					Saída: 212 					[ F = (9 * 100 / 5) + 32 ]
[C]Celsius, [F] Fahrenheit e [S] Sair: F
* 
Entre com a temperatura: 86 					Saída: 30 					[ C = 5 * (86 – 32) / 9 ]

[C]Celsius, [F] Fahrenheit e [S] Sair: S
 */

import java.util.Scanner;

public class POO015 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Scanner leiaStr = new Scanner(System.in);
                
        double temp;
        
        String escolha = "S";
        
        do {
			System.out.print("[C]Celsius, [F] Fahrenheit e [S] Sair: ");
			escolha = leiaStr.nextLine();
			switch(escolha) {
				case "C": case "c":
					System.out.print("Digite o valor da temperatura: ");
					temp = leia.nextDouble();
					double convertidoF = calculaF(temp);
					System.out.println("\nO valor convertido para Fahrenheit eh: " + convertidoF);
					break;
				case "F": case"f":
					System.out.print("Digite o valor da temperatura: ");
					temp = leia.nextDouble();
					double convertidoC = calculaC(temp);
					System.out.println("\nO valor convertido para Celsius eh: " + convertidoC);
					break;
				case "S": case "s":
					break;
				default:
					System.out.println("\nOpcao Invalida!");
					break;
			}
		} while (!escolha.equals("S"));
        
        
    }
    
    static double calculaC (double temp) {
		double convertidoC = (5 * (temp - 32)) / 9;
		return convertidoC;
	}
	
	static double calculaF (double temp) {
		double convertidoF = ((9 * temp)/5) + 32;
		return convertidoF;
	}
    
}
