package lista3;

import java.util.Scanner;

public class DoWhileSoma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, total=0;
		Scanner leia = new Scanner(System.in);
		
		
		do {
			System.out.println("Digite um numero: ");
			num = leia.nextInt();
			if (num >= 0) {
				total = num+total ;
			}

			
		} while (num != 0); 
		System.out.println("A soma dos numeros positivos é: " + total);
}
}
