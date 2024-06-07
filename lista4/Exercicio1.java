package lista4;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		int vetorinteir[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int num, entrada, valor=-1;	
		
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um valor que deseja encontrar no vetor ");
		entrada = leia.nextInt();

		for (num = 0; num < vetorinteir.length; num++) {

			if (entrada == (vetorinteir[num])) {
				valor = num;
				break;
							
			} 
						
		}
		if (valor != -1) {
			System.out.println("O Numero " + entrada + " se encontra no vetor " + valor);
		} else {
			System.out.println("O valor não se encontra no vetor");
		}
	}
}

