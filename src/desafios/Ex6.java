package desafios;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// Escreva um programa Java para calcular o valor médio de uma matriz de
		// inteiros, exceto o maior e o menor valor.
		Scanner scan = new Scanner(System.in);

		int menor = Integer.MAX_VALUE; // Definir menor como o maior valor possível
		int maior = Integer.MIN_VALUE; // Definir maior como o menor valor possível
		int total = 0;
		int soma = 0;
		int[] vetor = new int[5];

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite um nº ");
			vetor[i] = Integer.valueOf(scan.nextLine());
			total += vetor[i];

			if (vetor[i] > maior) {
				maior = vetor[i];
			}
			if (vetor[i] < menor) {
				menor = vetor[i];
			}
		}
		
		soma = (total - maior - menor);
		System.out.println("O total sem o maior e o menor é " + soma);
	}

}
