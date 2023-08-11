package javaapplication3;

import java.util.Scanner;

public class JavaApplication3 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

		int idade, x, y = 1;
		
		x = y;
		
		System.out.print("Entre com a idade: ");
		idade = leia.nextInt();
		
		if (idade < 18) {
                    System.out.println("Não pode ter CNH!");
		} else {
                    System.out.println("Pode ter CNH!");
                }
    }
    
}
