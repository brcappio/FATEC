/*
 * UsaPassaro.java
 * 
 * 
 */

import java.util.Scanner;

public class UsaPassaro {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		Scanner leiaStr = new Scanner(System.in);		
		Passaro happybirday = new Passaro();
		
		System.out.print("Digite o nome do passaro: ");
		happybirday.setNome(leiaStr.nextLine());
		
		System.out.print("Digite a idade do passaro: ");
		happybirday.setIdade(leia.nextInt());
		
		System.out.print("Digite a especie do passaro: ");
		happybirday.setEspecie(leiaStr.nextLine());
		
		System.out.print("Digite a cor da pena do passaro: ");
		happybirday.setCorPena(leiaStr.nextLine());
		
		System.out.println();
		System.out.println(happybirday.imp());
	}
}

