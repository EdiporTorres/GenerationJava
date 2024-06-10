package lista3;

import java.util.Scanner;

public class ForPareImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador, num, par = 0, impar= 0;
		Scanner leia = new Scanner(System.in);
		
		for (contador = 1; contador <= 10; contador++) {
			System.out.println("Digite o "+contador +"º valor: ");
			num = leia.nextInt();
			if (num % 2 == 0) {
				par++;
			} else {
				impar++;
			}

		}
		System.out.println("A quantidade de numero par é: "+par);
		System.out.println("A quantidade de numero impar é: "+impar);
	}

}
