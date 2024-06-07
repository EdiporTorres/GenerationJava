package lista4;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrizNota[][] = new int[10][4];

		
		Scanner leia = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println("Digite a " + (j + 1) + "º nota do aluno " + (i + 1) + " :");
				matrizNota[i][j] = leia.nextInt();
			}
		}
		for (int i = 0; i < 10; i++) {
			int soma = 0;
			for (int j = 0 ; j < 4; j++) {
				soma += matrizNota[i][j];

			}
			float media = (float) soma / 4;

					System.out.println("A media do aluno " + (1 + 1) + " é igual a:" + media);
				}
			}

	}

