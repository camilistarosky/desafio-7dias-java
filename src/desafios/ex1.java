package desafios;

public class ex1 {

	public static void main(String[] args) {
		// Escreva um programa Java para somar os valores de um array.

		int vetor[] = { 20, 2, 3, 5, 6, 9, 11, 17, 8, 4 };
		int soma = 0;

		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}

		System.out.println("A soma total é " + soma);
	}

}
