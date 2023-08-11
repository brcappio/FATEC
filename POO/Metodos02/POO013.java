/* Bruno Rosa Cappio
 * 8) [POO-013] Utilizando o método dado(), criado no exercício [POO-012], lance o dado 1 milhão de vezes.
Conte quantas vezes cada número saiu. A probabilidade deu certo? Ou seja, a porcentagem dos números
foi parecida?
 * 
 * 
 */


import java.util.Scanner;

public class POO013 {
	
	public static void main (String[] args) {
		Scanner leiaStr = new Scanner(System.in);
		String escolha;
		double count1 = 0,count2 = 0,count3 = 0,count4 = 0,count5 = 0,count6 = 0;
		
		System.out.println("Rodando o dado 1 milhao de vezes...\n\n--Resultados--");
		for (int i = 0; i <= 1000000; i++) {
			int numeroDado = dado();
			switch (numeroDado) {
			case 1:
				count1++;
				break;
			case 2:
				count2++;
				break;
			case 3:
				count3++;
				break;
			case 4:
				count4++;
				break;
			case 5:
				count5++;
				break;
			case 6:
				count6++;
				break;
			}
		}
		
		double[] porcentagens = porcentagemDouble(count1, count2, count3, count4, count5, count6);
		System.out.println("Porcentagens:");
		System.out.printf("1: %.0f (%.2f%%)\n", count1, porcentagens[0]);
		System.out.printf("2: %.0f (%.2f%%)\n", count2, porcentagens[1]);
		System.out.printf("3: %.0f (%.2f%%)\n", count3, porcentagens[2]);
		System.out.printf("4: %.0f (%.2f%%)\n", count4, porcentagens[3]);
		System.out.printf("5: %.0f (%.2f%%)\n", count5, porcentagens[4]);
		System.out.printf("6: %.0f (%.2f%%)\n", count6, porcentagens[5]);
		
	}
	static int dado() {
		return (int)(Math.random() * 6) + 1;
	}
	
	static double[] porcentagemDouble(double count1, double count2, double count3, double count4, double count5, double count6) {
		double total = 1000000;
		double[] porcentagens = new double[6];
		porcentagens[0] = count1 / total * 100;
		porcentagens[1] = count2 / total * 100;
		porcentagens[2] = count3 / total * 100;
		porcentagens[3] = count4 / total * 100;
		porcentagens[4] = count5 / total * 100;
		porcentagens[5] = count6 / total * 100;
		return porcentagens;
	}
}

