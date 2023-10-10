package desafios;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		// Escreva um programa Java para encontrar o valor máximo e mínimo de um array.

		Scanner scan = new Scanner(System.in);

		int vetor[] = new int[5];
		int maior = 0;
		int menor = 0;

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite um numero inteiro: ");
			vetor[i] = Integer.valueOf(scan.nextLine());
			maior = vetor[0];
			menor = vetor[0];
		}

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];
			}
			if (vetor[i] < menor) {
				menor = vetor[i];
			}
		}

		System.out.println("O maior numero: " + maior);
		System.out.println("O menor numero: " + menor);

	}

}
