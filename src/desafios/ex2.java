package desafios;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// Escreva um programa Java para calcular o valor médio dos elementos do array.
		Scanner scan = new Scanner(System.in);

		int vetor[] = new int[5];
		int soma = 0;
		float media = 0;

		for (int i : vetor) {
			System.out.println("Digite um numero: ");
			vetor[i] = Integer.valueOf(scan.nextLine());
			soma += vetor[i];
		}

		media = soma / 5;

		System.out.println("A media dos 5 numeros é: " + media);

	}

}
