/*
 * UsaAnimal.java
 * 
 * 
 */

import java.util.Scanner;

public class UsaAnimal {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		Scanner leiaStr = new Scanner(System.in);
		Animal maui = new Animal();
		
		System.out.print("Digite o nome do animal: ");
		maui.setNome(leiaStr.nextLine());
		
		System.out.print("Digite a idade do animal: ");
		maui.setIdade(leia.nextInt());
		
		System.out.print("Digite a especie do animal: ");
		maui.setEspecie(leiaStr.nextLine());
		
		System.out.println();
		System.out.println(maui.imp());
	}
}

