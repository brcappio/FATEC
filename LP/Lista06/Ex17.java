/* Bruno Rosa Cappio
 * 17) Escreva um programa em Java para ler as notas da 1a. e 2a. avaliações
 * de um aluno, calcule e imprima a média (simples) desse aluno. Só devem
 * ser aceitos valores válidos durante a leitura (0 a 10) para cada nota.
 * Ao final da execução a mensagem 'NOVO CALCULO (S/N)?' deve ser
 * apresentada. Se for respondido 'S' deve retornar e executar um novo
 * cálculo, caso contrário deverá encerrar o programa.
 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class Ex17{
	
	public static void main (String[] args){
		
		Scanner sc = new Scanner(System.in);
		Scanner scStr = new Scanner(System.in);
		double[] avaliacoes = new double[2];
		double somatorioAvaliacoes = 0,
			media = 0;
		String repete;
		
		do{
			
			for(int i = 0; i < avaliacoes.length; i++){
				
				while(true){
					
					System.out.print("Insira o " + (i+1) + " valor: ");
					
					try{
						
						avaliacoes[i] = sc.nextDouble();
						
						if(avaliacoes[i] >= 0 && avaliacoes[i] <= 10){
							
							System.out.println();
							break;
						}else{
							
							System.out.println("Ops...Insira um valor entre 0-10!");
						}
					}catch(InputMismatchException e){
						
						System.out.println("Ops...Insira um valor numerico!");
						sc.nextLine();
					}
				}
				
				somatorioAvaliacoes += avaliacoes[i];
			}
			
			media = somatorioAvaliacoes/avaliacoes.length;
			System.out.printf("Media das notas: %.2f", media);
			
			while(true){
				
				System.out.print("\n\nNOVO CALCULO(S/N)? ");
				repete = scStr.nextLine();
				
				if(repete.matches("^[sSnN]$")){
					
					somatorioAvaliacoes = 0;
					break;
				}else{
					
					System.out.print("Ops...Insira uma resposta valida!");
				}
			}
		}while(repete.equalsIgnoreCase("s"));
	}
}
