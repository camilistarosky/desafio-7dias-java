package desafios;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		//  Escreva um programa Java para encontrar o número de inteiros pares e ímpares em uma determinada matriz de inteiros.
		// exer 4
		
		Scanner scan = new Scanner(System.in);
		
		int vetor[] = new int[5];
		int par = 0;
		int impar = 0;
		
		for (int i : vetor) {
			System.out.println("Digite o numero: ");
			vetor[i] = Integer.valueOf(scan.nextLine());
			
			if (vetor[i] % 2 == 0) {
				par += 1;
			} else {
				impar += 1;
			}
		}
		
		System.out.println("O numero de pares: " +par+" e impares: " +impar);
	}

}
