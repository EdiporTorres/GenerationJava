package lista4;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vetorint[] = new int[10];
		int impar, par, soma=0;
		float media=0;
		Scanner leia = new Scanner(System.in);

		for (int indice = 0; indice < 10; indice++) {
			System.out.println("Digite o " + (indice + 1) + "º numero: ");
			vetorint[indice] = leia.nextInt();

		}
		System.out.println("O valores pares digitados foram: ");
		for (int i = 0; i < 10; i++) {
			if (vetorint[i] % 2 == 0) {
				System.out.println(vetorint[i]);
			}
		}
		System.out.println("Os valores impares digitados foram: ");
		for (int i = 0; i < 10; i++) {
			if (vetorint[i] % 2 != 0) {
				System.out.println(vetorint[i]);
			}
		}
		for (int i = 0; i<10; i++) {
			soma += vetorint[i];

		}
		System.out.println("A soma dos valores digitados é: "+soma);
		
		media= soma / 10;
		System.out.println("A Media de valores digitados é: "+media);

		}
	}


