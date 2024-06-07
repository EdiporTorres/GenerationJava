package lista4;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrizintei[][] = new int[3][3];
		int soma = 0;
		Scanner leia = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("Digite um valor para a posição " + "[" + i + "]" + "[" + j + "]:");
				matrizintei[i][j] = leia.nextInt();
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == j) {
					System.out.println("O valor armazenado na diagnoal primaria é: [" + i + "][" + j + "] é: "
							+ matrizintei[i][j]);
				}
			}

		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if ((i + j) == (matrizintei.length - 1)) {
					System.out.println("O valor armazenado na diagnoal secundaria é: [" + i + "][" + j + "] é: "
							+ matrizintei[i][j]);
				}
			}

		}
		for (int i = 0; i < matrizintei.length; i++)
			for (int j = 0; j < matrizintei.length; j++) {
				if (i == j) {
					soma += matrizintei[i][j];
				}
			}
		System.out.println("A soma dos valores na diagnonal primaria é : " + soma);
		
		soma = 0;
		
		for (int i = 0; i < matrizintei.length; i++) {
			for (int j = 0; j < matrizintei.length; j++) {
				if ((i + j) == (3 - 1)) {
					soma += matrizintei[i][j];
				}
			}
		}
		System.out.println("A soma dos valores na diagnonal secundaria é : " + soma);

	}

}
