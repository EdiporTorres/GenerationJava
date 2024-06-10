package lista2;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um numero");
		a = leia.nextInt();
		
		if (a % 2 == 0 ) {
			System.out.println("\nNumero é par");
		} else {
			System.out.println("\nnumero é impar");
		}
		if (a > 0) {
			System.out.println("e positivo");
			} else {
				System.out.println("e negativo");
			}
		
	}

}
