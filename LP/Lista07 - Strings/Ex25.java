/* Bruno Rosa Cappio
 * 25) Escreva um programa validador de senhas.
 * A regra para a criação de uma senha forte é que a senha deve ser de tamanho mínimo 10.
 * A senha deve conter letras maiúsculas, letras minúsculas, números e caracteres especiais/símbolos (!@#$%&*()+).
 * Outra regra, deve ter pelo menos 3 caracteres (maiúsculo ou minúsculo), pelo menos 3 números e pelo menos 2 símbolos.
 * O programa deve solicitar uma senha forte ao usuário até ele conseguir uma senha que respeite esses critérios.
 * Após cada senha digitada, apresentar as regras e se a senha passou pelos quesitos ou não.
 * 
 *Ex:
 *Senha: senha123
 * 
 *Regras
 *Tamanho 10: 8 (x)
 *Letras 3: 5 (ok)
 *Números 3: 3 (ok) 
 *Símbolos 2: 0 (x)
 *Senha reprovada! Tente novamente.
 * 
 *Senha: Bgp2Ip4*@1
 * 
 *Regras
 *Tamanho 10: 10 (ok)
 *Letras 3: 5 (ok)
 *Números 3: 3 (ok) 
 *Símbolos 2: 2 (ok)
 *Senha aprovada! Parabéns!
 * 
 * 
 */


import java.util.Scanner;

public class Ex25 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("==REGRAS PARA SUA SENHA==");
		System.out.println("Deve conter no mínimo 10 caracteres");
		System.out.println("Deve conter no mínimo 3 letras");
		System.out.println("Deve conter no mínimo 1 letra maiuscula");
		System.out.println("Deve conter no mínimo 3 numeros");
		System.out.println("Deve conter no mínimo 2 simbolos (!@#$%&*()+)");
		
		System.out.print("\nDigite uma senha: ");
		String senha = leia.nextLine();
		
		int contaLetras = 0;
		int contaNumeros = 0;
		int contaSimbolos = 0;
		boolean temMaiuscula = false;
		boolean tamanhoCerto = false;
		boolean letrasSuficientes = false;
		boolean numerosSuficientes = false;
		boolean simbolosSuficientes = false;
		
		//Conta letras e verifica se tem ao menos 1 maiuscula
		for (int i = 0; i < senha.length(); i++) {			
			for (int j = 'A'; j <= 'Z'; j++) {								
				if (senha.charAt(i) == j) {
					contaLetras++;
					temMaiuscula = true;
					break;			
				}
								
			}
			
			for (int j = 'a'; j <= 'z'; j++) {
				if (senha.charAt(i) == j) {
					contaLetras++;
					break;										
				}
				
			}			
		}
		
		//Verifica numeros
		for (int i = 0; i < senha.length(); i++) {
			for (int j = '1'; j <= '9'; j++) {
				
				if (senha.charAt(i) == j) {
					contaNumeros++;		
					break;			
				}				
			}
						
		}
		
		//Verifica simbolos
		for (int i = 0; i < senha.length(); i++) {
			if (senha.charAt(i) == '!' || senha.charAt(i) == '@' || senha.charAt(i) == '#' || senha.charAt(i) == '$' || senha.charAt(i) == '%' || senha.charAt(i) == '&' || senha.charAt(i) == '*' || senha.charAt(i) == '(' || senha.charAt(i) == ')' || senha.charAt(i) == '+') {
				contaSimbolos++;
			}
						
		}
		
		
		//Imprime e verifica
		System.out.println("\nREGRAS: ");
		if (senha.length() >= 10) {
			tamanhoCerto = true;
			System.out.println("Tamanho 10: " + senha.length() + " (ok)");
		} else {
			System.out.println("Tamanho 10: " + senha.length() + " (x)");
		}
		
		
		
		if (contaLetras >= 3) {
			letrasSuficientes = true;
			if (letrasSuficientes) {
				System.out.println("Letras 3: " + contaLetras + " (ok)");
			} 
		}
		else {
			System.out.println("Letras 3: " + contaLetras + " (x)");
		}
		
		System.out.println(temMaiuscula? "Tem maiuscula? (ok)" : "Tem maiuscula? (x)");
		
				
		if (contaNumeros >= 3) {
			numerosSuficientes = true;
			if (numerosSuficientes) {
				System.out.println("Numeros 3: " + contaNumeros + " (ok)");
			}
		}
		else {
			System.out.println("Numeros 3: " + contaNumeros + " (x)");
		}
		
		
		
		if (contaSimbolos >= 2) {
			simbolosSuficientes = true;
			if (simbolosSuficientes) {
				System.out.println("Simbolos 2: " + contaSimbolos + " (ok)");
			} 
		}
		else {
			System.out.println("Simbolos 2: " + contaSimbolos + " (x)");
		}
		
		if (tamanhoCerto && letrasSuficientes && numerosSuficientes && simbolosSuficientes && temMaiuscula) {
            System.out.println("\nSenha aprovada! Parabéns!");
        } else {
            System.out.println("\nSenha reprovada! Tente novamente.");
        }

	}
}

