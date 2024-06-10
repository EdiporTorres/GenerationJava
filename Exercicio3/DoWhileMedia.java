package exercicio3;

import java.util.Scanner;

public class DoWhileMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		float  total = 0 , cont=0;
		Scanner leia = new Scanner(System.in);



		do { cont++;
		System.out.println("Digite um numero: ");
		num = leia.nextInt();
			if (num % 3 == 0) {
				total = (num + total) / cont;
			}


		} while (num != 0);
		System.out.println("A media dos numeros multiplos de 3 é: " + total);
	}

}
