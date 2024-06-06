package exercicio3;

import java.util.Scanner;

public class DoWhileMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, cont, total = 0;
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		num = leia.nextInt();

		do {
			if (num % 3 == 0) {
				total = num + total;
			}
			System.out.println("Digite um numero: ");
			num = leia.nextInt();

		} while (num != 0);
		System.out.println("A soma dos numeros positivos é: " + total);
	}

}
