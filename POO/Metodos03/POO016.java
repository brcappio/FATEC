/* Bruno Rosa Cappio
 * 3) [POO-016] ===Desafio!!!=== Semelhante ao exercício [POO-015] Crie um programa de conversão de
temperaturas, mas agora com três possibilidades de unidade de medida: Celsius, Fahrenheit e Kelvin. A
saída deverá ser as outras duas temperaturas, exemplo: entrada em Celsius, a saída deve ser em Fahrenheit
e Kelvin. O processo de conversão deverá ser feito através de um ou mais métodos que recebe a
temperatura fornecida como parâmetro de entrada e retorne as temperaturas convertidas. Para os cálculos
de conversão, utilize as fórmulas C = 5 * (F - 32) / 9, F = (9 * C / 5) + 32 e K = C + 273. O programa deve ser
executado enquanto o usuário desejar.
* 
Entrada: 												Saída: 							Cálculo:
[C]Celsius, [F] Fahrenheit, [K] Kelvin e [S] Sair: M
Opção Inválida!
* 
[C]Celsius, [F] Fahrenheit, [K] Kelvin e [S] Sair: C 								    [ F = (9 * 0 / 5) + 32 ]
Entre com a temperatura: 0 								F: 32 e K: 273 					[ K = 0 + 273 ]

[C]Celsius, [F] Fahrenheit, [K] Kelvin e [S] Sair: S
* 
[C]Celsius, [F] Fahrenheit, [K] Kelvin e [S] Sair: S
* 
[C]Celsius, [F] Fahrenheit, [K] Kelvin e [S] Sair: C 									[ F = (9 * 100 / 5) + 32 ]
Entre com a temperatura: 100 						    F: 212 e K: 373     			[ K = 100 + 273 ]
* 
[C]Celsius, [F] Fahrenheit, [K] Kelvin e [S] Sair: F									[ C = 5 * (86 – 32) / 9 ]
Entre com a temperatura: 86 							C: 30 e F: 303 					[ F = (9 * 100 / 5) + 32 ]
* 
[C]Celsius, [F] Fahrenheit, [K] Kelvin e [S] Sair: K									[ C = 0 – 273 ]
Entre com a temperatura: 0 								C: -273 e F: -459,4 			[ F = (9 * (0 – 273) / 5) + 32 ]
* 
[C]Celsius, [F] Fahrenheit, [K] Kelvin e [S] Sair: S
 * 
 * 
 */

import java.util.Scanner;

public class POO016 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
        Scanner leiaStr = new Scanner(System.in);
                
        double temp;
        
        String escolha = "S";
        
        do {
			System.out.print("[C]Celsius, [F] Fahrenheit, [K] Kelvin e [S] Sair: ");
			escolha = leiaStr.nextLine();
			switch(escolha) {
				case "C": case "c":
					System.out.print("Digite o valor da temperatura: ");
					temp = leia.nextDouble();
					double convertidoF = calculaF(temp);
					System.out.println("\nF: " + convertidoF);
					double convertidoK = calculaK(temp);
					System.out.println("\nK: " + convertidoK);
					break;
				case "F": case"f":
					System.out.print("Digite o valor da temperatura: ");
					temp = leia.nextDouble();
					double convertidoC = calculaC(temp);
					System.out.println("\nC: " + convertidoC);
					convertidoK = calculaK(convertidoC);
					System.out.println("\nK: " + convertidoK);
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
	
	static double calculaK (double temp) {
		double convertidoK = temp + 273;
		return convertidoK;
	}
}

