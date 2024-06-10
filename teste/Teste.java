package teste;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		int contador, num1, num2;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o primeiro numero do intervalo: ");
		num1 = leia.nextInt();
		System.out.println("Digite o segundo10 numero do intervalo: ");
		num2 = leia.nextInt();
		leia.close();
		if (num1 >= num2) {
			System.out.println("Intervalo inválido!");
		}
	
		for (contador = num1 ; contador <= num2; contador++) {
			if (contador % 3 == 0 && contador % 5 == 0 ) {
				System.out.println(contador+" é múltiplo de 3 e 5");
			} 
		}
	}

}
