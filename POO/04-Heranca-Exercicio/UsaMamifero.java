/*
 * UsaMamifero.java
 * 
 * 
 */

import java.util.Scanner;

public class UsaMamifero {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		Scanner leiaStr = new Scanner(System.in);		
		Mamifero mamifero = new Mamifero();
		
		System.out.print("Digite o nome do mamifero: ");
		mamifero.setNome(leiaStr.nextLine());
				
		System.out.print("Digite a idade do mamifero: ");
		mamifero.setIdade(leia.nextInt());
		
		System.out.print("Digite a especie do mamifero: ");
		mamifero.setEspecie(leiaStr.nextLine());
		
		System.out.print("Digite o habitat do mamifero: ");
		mamifero.setHabitat(leiaStr.nextLine());
		
		System.out.print("O mamifero tem bico? (S/N): ");
		if (leiaStr.nextLine().equalsIgnoreCase("S")) {
			mamifero.setBico(true);
		} else {
			mamifero.setBico(false);
		}
		
		
		System.out.println();
		System.out.println(mamifero.imp());
	}
}

