package desafios;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// Escreva um programa Java para obter a diferença entre o maior e o menor valor
		// em uma matriz de inteiros. A matriz deve ter um comprimento de pelo menos 1.
		Scanner scan = new Scanner(System.in);
		
		int[] vetor = new int[5];
		int maior = 0;
		int menor  = 0;
		int diferenca = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite um numero: ");
			vetor[i] = Integer.valueOf(scan.nextLine());
			maior = vetor[0];
			menor = vetor[0];
			
			if (vetor[i] > maior) {
				maior = vetor[i];
			}
			if (vetor[i] < menor) {
				menor = vetor[i];
			}
		}

		diferenca = maior - menor;
		
		System.out.println("A diferença entre o maior e o menor n é: "+diferenca);
	}

}
